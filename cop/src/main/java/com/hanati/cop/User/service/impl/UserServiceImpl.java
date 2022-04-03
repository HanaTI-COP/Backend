package com.hanati.cop.User.service.impl;

import com.hanati.cop.User.domain.User;
import com.hanati.cop.User.dto.UserSigninDto;
import com.hanati.cop.User.dto.UserSignupDto;
import com.hanati.cop.User.repository.UserRepository;
import com.hanati.cop.User.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public void signUp(UserSignupDto userSignupDto) {
        userRepository.save(User.signUp(userSignupDto));
    }

    @Override
    public void signIn(UserSigninDto userSigninDto) {
        userRepository.findByEmailAndPassword(userSigninDto.getEmail(), userSigninDto.getPassword())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 이메일이거나 비밀번호가 일치하지 않습니다."));
    }
}
package com.hanati.cop.User.service.impl;

import com.hanati.cop.User.domain.User;
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
}

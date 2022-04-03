package com.hanati.cop.User.service;

import com.hanati.cop.User.dto.UserSigninDto;
import com.hanati.cop.User.dto.UserSignupDto;

public interface UserService {

    void signUp(UserSignupDto userSignupDto);

    void signIn(UserSigninDto userSigninDto);
}

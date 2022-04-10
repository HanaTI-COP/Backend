package com.hanati.cop.User.controller;

import com.hanati.cop.User.dto.UserSigninDto;
import com.hanati.cop.User.dto.UserSignupDto;
import com.hanati.cop.User.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserSignupController {

    private final UserService userService;

    @PostMapping("/api/user/signup")
    public ResponseEntity<?> signup(@RequestBody UserSignupDto userSignupDto) {
        userService.signUp(userSignupDto);
        return ResponseEntity.ok(true);
    }

    @PostMapping("/api/user/signin")
    public ResponseEntity<?> signin(@RequestBody UserSigninDto userSigninDto) {
        userService.signIn(userSigninDto);
        return ResponseEntity.ok(true);
    }
}

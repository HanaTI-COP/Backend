package com.hanati.cop.User.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
public class UserSignupDto {

    @NotEmpty(message = "이메일을 입력해주세요.")
    private String email;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password_check;

    @NotEmpty(message = "회사를 선택해주세요.")
    private String company;

    @NotEmpty(message = "소속팀을 입력해주세요.")
    private String team;

    @NotEmpty(message = "이름을 입력해주세요.")
    private String username;
}

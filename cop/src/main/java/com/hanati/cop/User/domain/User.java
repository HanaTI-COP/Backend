package com.hanati.cop.User.domain;

import com.hanati.cop.User.dto.UserSignupDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "USER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cpin;

    private String username;

    private String email;

    private String password;

    private String company;

    private String team;

    public static User signUp(UserSignupDto dto) {
        return User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .company(dto.getCompany())
                .team(dto.getTeam())
                .build();

    }
}

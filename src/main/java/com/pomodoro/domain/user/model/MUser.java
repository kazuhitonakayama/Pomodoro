package com.pomodoro.domain.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class MUser {
    private String userId;
    private String password;
    private String userName;
    private Date birthday;
    private Integer age;
    private Integer gender;
    private String role;
}

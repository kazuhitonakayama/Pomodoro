package com.pomodoro.form;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class SignupForm {
    @NotBlank
    @Email
    private String userId;

    @NotBlank
    @Length(min = 6, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String password;

    @NotBlank
    private String userName;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    @NotNull
    @Min(10)
    @Max(120)
    private Integer age;

    @NotNull
    private Integer gender;
}

package com.pomodoro.form.circles;

import lombok.Data;

@Data
public class CreateCircleForm {
    private int id;
    private String circleName;
    private String description;
}
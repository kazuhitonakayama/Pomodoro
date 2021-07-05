package com.pomodoro.form;

import lombok.Data;

@Data
public class PostForm {
    private int id;
    private int circle_id;
    private String title;
    private String body;
}
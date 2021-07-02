package com.pomodoro.form;

import lombok.Data;

@Data
public class ArticleForm {
    private int id;
    private String clubName;
    private String title;
    private String body;
}
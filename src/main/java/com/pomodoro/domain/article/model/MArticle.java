package com.pomodoro.domain.article.model;

import lombok.Data;

@Data
public class MArticle {
    private int id;
    private String clubName;
    private String title;
    private String body;

    public void setTitle(String title) {
        this.title = title;
    }
}

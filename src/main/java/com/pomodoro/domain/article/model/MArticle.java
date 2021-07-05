package com.pomodoro.domain.article.model;

import lombok.Data;

@Data
public class MArticle {
    private int id;
    private int circle_id;
    private String title;
    private String body;
}

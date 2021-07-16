package com.pomodoro.domain.circle.model;

import lombok.Data;

@Data
public class MCircle {
    private int id;
    private String circleName;
    private String description;
    private Boolean isActive;
}

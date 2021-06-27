package com.pomodoro.form;

import lombok.Data;

@Data
public class PostForm {
    private int id;
    private String clubName;
    private String title;
    private String body;
    
//    public String getTitle() {
//        return "Title";//こうすればDB登録できた
//    }

}

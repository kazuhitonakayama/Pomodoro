package com.pomodoro.controller;

import com.pomodoro.form.circles.CreateCircleForm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
import com.pomodoro.form.EditForm;
import com.pomodoro.form.PostForm;
import org.springframework.ui.Model;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/circles")
@Slf4j
public class CircleController {

    // 新規サークル投稿画面を表示
    @GetMapping("/new")
    public String getCirclePostPage(@ModelAttribute CreateCircleForm form) {
        return "circles/new";
    }

}

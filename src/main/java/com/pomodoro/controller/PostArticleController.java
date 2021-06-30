package com.pomodoro.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
import com.pomodoro.form.PostForm;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/circles")
@Slf4j
public class PostArticleController {
    @Autowired
    private ArticleService articleservice; //ArticleServiceImplを注入？

    @Autowired
    private ModelMapper modelMapper;


    /**
     * 記事登録画面を表示
     */
    @GetMapping("/new")
    public String getPost(@ModelAttribute PostForm form) {
        return "circles/new";
    }

    /**
     * 記事登録処理
     */
    @PostMapping("/new")
    public String postRequest(@ModelAttribute PostForm form) {
        //ログを表示
        log.info(form.toString());

        // formをMArticleクラスに変換
        MArticle article = modelMapper.map(form, MArticle.class);

        // ユーザー登録
        articleservice.postPage(article);

        //index.htmlに画面遷移
        return "redirect:/index";
    }
}


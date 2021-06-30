package com.pomodoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.pomodoro.domain.article.service.ArticleService;

@Controller
public class deleteArticleController {
    
    @Autowired
    private ArticleService articleservice; //ArticleServiceImplを注入？

    @RequestMapping(value="/circles/{id}")
    public String deleteArticle(@PathVariable("id") int id) {

        articleservice.deletePage(id);

        return "redirect:/";
    }
}
package com.pomodoro.controller;

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
@RequestMapping("/articles")
@Slf4j
public class ArticleController {
    @Autowired
    private ArticleService articleservice;

    @Autowired
    private ModelMapper modelMapper;


    /**
     * 新規投稿
     */
    // 新規投稿画面を表示
    @GetMapping("/new")
    public String getPost(@ModelAttribute PostForm form) {
        return "circles/new";
    }
    // 新規投稿処理
    @PostMapping("/new")
    public String postRequest(@ModelAttribute PostForm form) {
        //ログを表示
        log.info(form.toString());

        // formをMArticleクラスに変換
        MArticle article = modelMapper.map(form, MArticle.class);

        // ユーザー登録
        articleservice.postPage(article);

        //index.htmlに画面遷移
        return "redirect:/";
    }


    /**
     * 記事編集
     */
    // 編集画面を表示
    @GetMapping("/edit/{id}")
    public String editPost(@ModelAttribute EditForm form,Model model,@PathVariable("id") int id) {
        MArticle article = articleservice.getArticleOne(id);
        form = modelMapper.map(article, EditForm.class);
        model.addAttribute("editForm", form);
        return "circles/edit";
    }
    // 編集処理
    @PostMapping(value = "/edit" , params = "update")
    public String updateArticle(EditForm form,Model model) {
        articleservice.updateArticleOne(form.getId(), form.getCircle_id(), form.getTitle(), form.getBody());
        return "redirect:/";
    }

    /**
     * 記事削除処理
     */
    @PostMapping(value = "/edit" , params = "delete")
    public String deleteArticle(EditForm form, Model model) {
        articleservice.deletePage(form.getId());
        return "redirect:/";
    }
}


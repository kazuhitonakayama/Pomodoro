package com.pomodoro.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
import com.pomodoro.form.EditForm;
import org.springframework.ui.Model;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/circles")
@Slf4j
public class EditArticleController {
    @Autowired
    private ArticleService articleservice; //ArticleServiceImplを注入？

    @Autowired
    private ModelMapper modelMapper;

    /**
     * 記事登録画面を表示
     */
    @GetMapping("/edit/{id}")
    public String editPost(@ModelAttribute EditForm form,Model model,@PathVariable("id") int id) {
        MArticle article = articleservice.getArticleOne(id);
        form = modelMapper.map(article, EditForm.class);
        model.addAttribute("editForm", form);

        return "circles/edit";
    }

    /**
     * 記事編集処理
     */
    @PostMapping(value = "/edit" , params = "update")
    public String updateArticle(EditForm form,Model model) {
        articleservice.updateArticleOne(form.getId(), form.getClubName(), form.getTitle(), form.getBody());

        //index.htmlに画面遷移
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


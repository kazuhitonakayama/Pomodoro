package com.pomodoro.controller;

import com.pomodoro.domain.circle.model.MCircle;
import com.pomodoro.domain.circle.service.CircleService;
import com.pomodoro.form.circles.CreateCircleForm;
import com.pomodoro.form.circles.EditCircleForm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @Autowired
    private CircleService circleService;

    @Autowired
    private ModelMapper modelMapper;


    // 新規サークル投稿画面を表示
    @GetMapping("/new")
    public String getCirclePostPage(@ModelAttribute CreateCircleForm form) {
        return "circles/new";
    }
    // 新規部活投稿処理
    @PostMapping("/new")
    public String postRequest(@ModelAttribute CreateCircleForm form) {
        //ログを表示
        log.info(form.toString());

        // formをMCircleクラスに変換
        MCircle circle = modelMapper.map(form, MCircle.class);

        // 部活登録
        circleService.postCircle(circle);

        //index.htmlに画面遷移
        return "redirect:/";
    }

    @GetMapping("") //localhost:8080/circlesを指定
    public String getCircleList(Model model) {

        //circles/index.htmlに画面遷移
        List<MCircle> circleList = circleService.getCircles();
        model.addAttribute("circleList", circleList);
        return "circles/index";//src/main/resource/templatesからの相対パス（ファイル名のみ・拡張子省略）
    }

    /**
     * 記事編集
     */
    // 編集画面を表示
    @GetMapping("/edit/{id}")
    public String editPost(@ModelAttribute EditCircleForm form, Model model, @PathVariable("id") int id) {
        MCircle circle = circleService.getCircleOne(id);
        form = modelMapper.map(circle, EditCircleForm.class);
        model.addAttribute("editCircleForm", form);
        return "circles/edit";
    }
    // 編集処理
    @PostMapping(value = "/edit", params = "update")
    public String updateCircle(EditCircleForm form, Model model) {
        circleService.updateCircleOne(form.getId(), form.getCircleName(), form.getDescription());
        return "redirect:";
    }
}

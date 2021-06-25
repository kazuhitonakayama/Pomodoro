package com.pomodoro.controller;

//import java.util.Locale;
//import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
// import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

// import com.example.application.service.UserApplicationService;
import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
// import com.example.form.GroupOrder;
import com.pomodoro.form.PostForm;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/circles")
@Slf4j
public class PostArticleController {

//    @Autowired
//    private UserApplicationService userApplicationService;
//
    @Autowired
    private ArticleService articleservice; //ArticleServiceImplを注入？

    @Autowired
    private ModelMapper modelMapper;


    /**
     * 記事登録処理
     */
    @PostMapping("/new")
    public String postRequest(@RequestParam("InputTitle") String title, @RequestParam("InputActivity") String body, Model model, PostForm form) {
        //画面から受け取った文字列をModelに登録
        // model.addAttribute("Title",title);
        // model.addAttribute("Body",body);

        // log.info(form.toString());

        // titleをMArticleクラスに変換
        // MArticle article = modelMapper.map(form, MArticle.class);
        // //何らかの原因で、lombokの@Dataアノテーションが機能していない可能性アリ
        // //getterとsetterを直接記入した上で、冗長な書き方をしてみた
        MArticle article = new MArticle();
        article.setTitle(form.getTitle());
        

        // ユーザー登録
        articleservice.postPage(article);

        // ログイン画面にリダイレクト
        // return "redirect:/login";

        //toppageに画面遷移
        return "circles/ViewTest";
    }


//    public String postArticle(Model model, Locale locale,
//                             @ModelAttribute @Validated(GroupOrder.class) SignupForm form,
//                             BindingResult bindingResult) {

//        // 入力チェック結果
//        if (bindingResult.hasErrors()) {
//            // NG:ユーザー登録画面に戻ります
//            return getSignup(model, locale, form);
//        }
}


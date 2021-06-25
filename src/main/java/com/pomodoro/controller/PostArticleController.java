package com.pomodoro.controller;

//import java.util.Locale;
//import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

// import com.example.application.service.UserApplicationService;
import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
// import com.example.form.GroupOrder;
// import com.example.form.SignupForm;

import lombok.extern.slf4j.Slf4j;

@Controller
//@RequestMapping("/user")
@Slf4j
public class PostArticleController {

//    @Autowired
//    private UserApplicationService userApplicationService;
//
//    @Autowired
//    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

//    /**
//     * ユーザー登録画面を表示
//     */
//    @GetMapping("/newpost")
//    public String getSignup(Model model, Locale locale,
//                            @ModelAttribute SignupForm form) {
//        // 性別を取得
//        Map<String, Integer> genderMap = userApplicationService.getGenderMap(locale);
//        model.addAttribute("genderMap", genderMap);
//
//        // ユーザー登録画面に遷移
//        return "user/signup";
//    }

    /**
     * 記事登録処理
     */
    @PostMapping("/circles/new")
    public String postRequest(@RequestParam("InputTitle") String title, @RequestParam("InputActivity") String body,Model model){
        //画面から受け取った文字列をModelに登録
        model.addAttribute("Title",title);
        model.addAttribute("Body",body);

        //toppageに画面遷移
        return "circles/ViewTest";
    }


//    public String postArticle(Model model, Locale locale,
//                             @ModelAttribute @Validated(GroupOrder.class) SignupForm form,
//                             BindingResult bindingResult) {
//
//        // 入力チェック結果
//        if (bindingResult.hasErrors()) {
//            // NG:ユーザー登録画面に戻ります
//            return getSignup(model, locale, form);
//        }
//
//        log.info(form.toString());
//
//        // formをMUserクラスに変換
//        MUser user = modelMapper.map(form, MUser.class);
//
//        // ユーザー登録
//        userService.signup(user);
//
//        // ログイン画面にリダイレクト
//        return "redirect:/login";
//    }
}

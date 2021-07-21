package com.pomodoro.controller;

import com.pomodoro.application.service.UserApplicationService;
import com.pomodoro.domain.user.model.MUser;
import com.pomodoro.domain.user.service.UserService;
import com.pomodoro.form.GroupOrder;
import com.pomodoro.form.SignupForm;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {
    @Autowired
    private UserApplicationService userApplicationService;

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;


    /**
     * ユーザー登録画面を表示
     */
    @GetMapping("/signup")
    public String getSignup(Model model, @ModelAttribute SignupForm form) {
        //性別を取得
        Map<String, Integer> genderMap = userApplicationService.getGenderMap();
        model.addAttribute("genderMap", genderMap);

        //ユーザー登録画面に遷移
        return "user/signup";
    }

    /**
     * ユーザー登録処理
     */
    @PostMapping("/signup")
    public String postSignup(Model model, @ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult) {

        System.out.println(bindingResult);
        //入力チェック結果
        if(bindingResult.hasErrors()){
            //NG：ユーザー登録画面に戻ります
            return getSignup(model, form);
        }
        log.info(form.toString()); //slf4jを使ってform入力のログを表示

       //formをMUserクラスに変換
       MUser user = modelMapper.map(form, MUser.class);

       //ユーザ登録
       userService.registUser(user);

        // ログイン画面にリダイレクト
        return "redirect:/login";
    }
}

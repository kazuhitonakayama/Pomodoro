package com.pomodoro.controller;

import com.pomodoro.PomodoroApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@AutoConfigureMockMvc
@SpringBootTest(classes = PomodoroApplication.class)
public class SignupControllerTest {
    //mockMvc TomcatサーバへデプロイすることなくHttpリクエスト・レスポンスを扱うためのMockオブジェクト
    @Autowired
    private MockMvc mockMvc;
    /**
    MEMO:/dasfsdakflという文字列でもloginページが表示されるため、これはコントローラーのテストではない
    */
//    @Test
//    @DisplayName("/signupにアクセスすると/loginにリダイレクトされるため302が返る")
//    void test1() throws Exception {
//        // andDo(print())でリクエスト・レスポンスを表示
//        this.mockMvc.perform(get("/aaaaa")).andDo(print())
//                .andExpect(status().is3xxRedirection());
//    }

    @Test
    @DisplayName("/user/signupにアクセスすると200が返り、user/signup.htmlが表示される")
    void test2() throws Exception {
        // andDo(print())でリクエスト・レスポンスを表示
        this.mockMvc.perform(get("/user/signup")).andDo(print())
                .andExpect(view().name("user/signup"));
    }

    //TODO:POSTのテストが書けていない
}

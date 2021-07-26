package com.pomodoro.controller;

import com.pomodoro.PomodoroApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@AutoConfigureMockMvc
@SpringBootTest(classes = PomodoroApplication.class)
public class LoginControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/loginにアクセスすると200が返ってきて、login/loginが表示される")
    void test1() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("login/login"));
    }
    //TODO:POSTのテストが書けていない
}

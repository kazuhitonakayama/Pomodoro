package com.pomodoro.circles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//画面などからHTTPリクエストを受け付けるクラス
@Controller
@RequestMapping
public class CirclesContoroller {

    @GetMapping("/index") //localhost:8080/helloを指定
    public String getHello() {
        //hello.htmlに画面遷移
        return "index";//src/main/resource/templatesからの相対パス（ファイル名のみ・拡張子省略）
    }
}

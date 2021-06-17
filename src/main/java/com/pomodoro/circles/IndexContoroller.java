package com.pomodoro.circles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//画面などからHTTPリクエストを受け付けるクラス
@Controller
public class IndexContoroller {
    /**
     * サークル一覧画面を表示
     */
    @GetMapping("/index") //localhost:8080/helloを指定
    public String getIndex() {
        //index.htmlに画面遷移
        return "index";//src/main/resource/templatesからの相対パス（ファイル名のみ・拡張子省略）
    }
}

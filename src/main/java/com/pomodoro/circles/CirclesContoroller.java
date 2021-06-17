package com.pomodoro.circles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

//画面などからHTTPリクエストを受け付けるクラス
@Controller
public class CirclesContoroller {

    @GetMapping("/index") //localhost:8080/helloを指定
    public String getHello() {
        //hello.htmlに画面遷移
        return "index";//src/main/resource/templatesからの相対パス（ファイル名のみ・拡張子省略）
    }
    
    @GetMapping("/circles/golf")
    public String postGolfPage(Model model) {
    	return "/circles/golf";
    }
    
    @GetMapping("/circles/mahjong")
    public String postMahjongPage(Model model) {
    	return "/circles/mahjong";
    }
    
    @GetMapping("/circles/fishing")
    public String postFishingPage(Model model) {
    	return "/circles/fishing";
    }
    
    @GetMapping("/circles/darts")
    public String getDartsPage(Model model) {
    	return "/circles/darts";
    }
    
    @GetMapping("/circles/gyoza")
    public String postGyozaPage(Model model) {
    	return "/circles/gyoza";
    }
    
}

package com.pomodoro.circles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//画面などからHTTPリクエストを受け付けるクラス
@Controller
public class IndexContoroller {
    /**
     * サークル一覧画面を表示
     */
    @GetMapping("/index") //localhost:8080/indexを指定
    public String getIndex() {
        //index.htmlに画面遷移
        return "index";//src/main/resource/templatesからの相対パス（ファイル名のみ・拡張子省略）
    }

    //REVIEW: ページを表示するだけなら、GetMappingで良いと思うが、何かしら値をやり取りするならPostMappingの方が良さそう
    @GetMapping("/circles/golf")
    public String getGolfPage() {
        return "/circles/golf";
    }

    @GetMapping("/circles/majan")
    public String getMajanPage() {
        return "/circles/majan";
    }

    @GetMapping("/circles/fishing")
    public String getFishingPage() {
        return "/circles/fishing";
    }

    @GetMapping("/circles/darts")
    public String getDartsPage() {
        return "/circles/darts";
    }

    @GetMapping("/circles/gyoza")
    public String getGyozaPage() {
        return "/circles/gyoza";
    }

    @GetMapping("/circles/new")
    public String getNewPostPage() {
        return "/circles/new";
    }

}

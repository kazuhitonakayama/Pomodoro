package com.pomodoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Articleを取得
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;


//画面などからHTTPリクエストを受け付けるクラス
@Controller
public class IndexController {
    @Autowired
    private ArticleService articleService;

    /**
     * サークル一覧画面を表示
     */
    @GetMapping("/index") //localhost:8080/indexを指定
    public String getArticleList(Model model) {
        //index.htmlに画面遷移
        List<MArticle> articleList = articleService.getArticles();
        model.addAttribute("articleList", articleList);
        return "index";//src/main/resource/templatesからの相対パス（ファイル名のみ・拡張子省略）
    }

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

    

}

package com.pomodoro.domain.article.service;

import com.pomodoro.domain.article.model.MArticle;
import java.util.List;

public interface ArticleService {
    /**
     * 記事登録
     */
    public void postPage(MArticle article);

    /**
     * 記事取得
     */
    public List<MArticle> getUsers();
}

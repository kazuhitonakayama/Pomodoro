package com.pomodoro.domain.article.service;

import com.pomodoro.domain.article.model.MArticle;

public interface ArticleService {
    /**
     * 記事登録
     */
    public void postPage(MArticle article);
}

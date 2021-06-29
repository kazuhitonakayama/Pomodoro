package com.pomodoro.domain.article.service;

import com.pomodoro.domain.article.model.MArticle;

public interface ArticleService {
    /**
     * 記事登録（1件）
     */
    public void postPage(MArticle article);

    /**
     * 記事削除（1件）
     */
    public void deletePage(int id);
}

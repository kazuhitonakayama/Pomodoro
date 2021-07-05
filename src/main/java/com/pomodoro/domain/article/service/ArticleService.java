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
    public List<MArticle> getArticles();

    /**
     * 記事取得1件
     */
    public MArticle getArticleOne(int id);

    /**
     * 記事削除（1件）
     */
    public void deletePage(int id);

    /**
     * 記事編集（1件）
     */
    public void updateArticleOne(int id,
        int circle_id,
        String clubName,
        String title,
        String body
    );
}

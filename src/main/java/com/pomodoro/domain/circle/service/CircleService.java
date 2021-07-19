package com.pomodoro.domain.circle.service;

import com.pomodoro.domain.circle.model.MCircle;
import com.pomodoro.domain.article.model.MArticle;
import java.util.List;

public interface CircleService {
     /**
      * 記事登録
      */
     public void postCircle(MCircle circle);

    /**
     * サークル取得
     */
    public List<MCircle> getCircles();

    /**
     * 非表示サークル取得
     */
    public List<MCircle> getInactiveCircles();

    /**
     * サークルの活動一覧を取得
     */
    public List<MArticle> getArticles(int id);

    /**
     * サークルの名前を取得 @ サークル詳細ページ
     */
    public String getCircleName(int id);

    /**
    * サークル取得1件
    */
    public MCircle getCircleOne(int id);

    /**
     * サークル削除（1件）
    */
    public void deleteCircleOne(int id);

    /**
     * 記事編集（1件）
     */
    public void updateCircleOne(int id,
        String circleName,
        String description
    );
}

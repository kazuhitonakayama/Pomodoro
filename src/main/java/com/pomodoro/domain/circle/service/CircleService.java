package com.pomodoro.domain.circle.service;

import com.pomodoro.domain.circle.model.MCircle;
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

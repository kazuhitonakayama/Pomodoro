package com.pomodoro.domain.circle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pomodoro.domain.circle.model.MCircle;
import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.circle.service.CircleService;
import com.pomodoro.repository.CircleMapper;

import java.util.List;

@Service
public class CircleServiceImpl implements CircleService {

    @Autowired
    private CircleMapper mapper;

     /**
      * 記事登録
      */
     @Override
     public void postCircle(MCircle circle) {
         mapper.insertOne(circle);
     }

    /**
     * サークル取得
     */
    @Override
    public List<MCircle> getCircles() {
        return mapper.findMany();
    }

    /**
     * 非表示サークル取得
     */
    @Override
    public List<MCircle> getInactiveCircles() {
        return mapper.findInactive();
    }

    /**
     * サークルの活動一覧取得
     */
    @Override
    public List<MArticle> getArticles(int id) {
        return mapper.findArticlesOfCircle(id);
    }
    
    /**
     * サークルの名前取得 @ サークル詳細ページ
     */
    @Override
    public String getCircleName(int id) {
        return mapper.findCircleName(id);
    }

    //    /** 記事取得（1件）*/
    @Override
    public MCircle getCircleOne(int id) {
        return mapper.findCircleOne(id);
    }


     /** 記事削除（1件）*/
     @Override
     public void deleteCircleOne(int id) {
         mapper.deleteOne(id);
     }

     /** 記事編集（1件）*/
    @Override
    public void updateCircleOne(int id,
        String circleName,
        String description) {
        mapper.updateOne(id,circleName,description);
    }
}

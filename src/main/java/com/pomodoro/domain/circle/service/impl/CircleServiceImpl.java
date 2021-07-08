package com.pomodoro.domain.circle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pomodoro.domain.circle.model.MCircle;
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
     @Override
     public void deleteRelatedArticles(int id) {
         mapper.deleteArticlesOfCircle(id);
     }

     /** 記事編集（1件）*/
    @Override
    public void updateCircleOne(int id,
        String circleName,
        String description) {
        mapper.updateOne(id,circleName,description);
    }
}

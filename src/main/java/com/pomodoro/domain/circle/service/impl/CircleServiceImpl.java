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

    // /**
    //  * 記事取得
    //  */
    // @Override
    // public List<MArticle> getArticles() {
    //     return mapper.findMany();
    // }

//    /** 記事取得（1件）*/
//    @Override
//    public MCircle getCircleName(int id) {
//        return mapper.findCircleName(id);
//    }


    // /** 記事削除（1件）*/
    // @Override
    // public void deletePage(int id) {
    //     int count = mapper.deleteOne(id);
    // }

    // /** 記事編集（1件）*/
    // @Override
    // public void updateArticleOne(int id,
    //     int circle_id,
    //     String title,
    //     String body) {
    //     mapper.updateOne(id,circle_id,title,body);
    // }
}

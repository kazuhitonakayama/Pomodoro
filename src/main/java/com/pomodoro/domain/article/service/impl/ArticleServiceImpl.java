package com.pomodoro.domain.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
import com.pomodoro.repository.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper mapper;

    /** 記事登録（1件）*/
    @Override
    public void postPage(MArticle article){
        mapper.insertOne(article); 
    }

    /** 記事削除（1件）*/
    @Override
    public void deletePage(int id) {
        int count = mapper.deleteOne(id); 
    }
}

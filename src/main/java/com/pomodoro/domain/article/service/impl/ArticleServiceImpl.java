package com.pomodoro.domain.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pomodoro.domain.article.model.MArticle;
import com.pomodoro.domain.article.service.ArticleService;
import com.pomodoro.repository.ArticleMapper;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper mapper;

    /** 記事登録 */
    @Override
    public void postPage(MArticle article){
        mapper.insertOne(article); 
    }

    /** 記事取得 */
    @Override
    public List<MArticle> getArticles(){
        return mapper.findMany();
    }
}

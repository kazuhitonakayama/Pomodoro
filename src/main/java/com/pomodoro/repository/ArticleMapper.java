package com.pomodoro.repository;

import org.apache.ibatis.annotations.Mapper;

import com.pomodoro.domain.article.model.MArticle;

@Mapper
public interface ArticleMapper {
    /** 記事登録 */
    public int insertOne(MArticle article);
}

package com.pomodoro.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pomodoro.domain.article.model.MArticle;

@Mapper
public interface ArticleMapper {
    /** 記事登録（1件） */
    public int insertOne(MArticle article);

    /** 記事削除(1件) */
    public int deleteOne(@Param("id") int id);

    /** 記事更新(1件)
    これからやる
    */
    // public int updateOne(@Param("id") String id);
}

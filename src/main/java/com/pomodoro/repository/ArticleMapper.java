package com.pomodoro.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pomodoro.domain.article.model.MArticle;
import java.util.List;

@Mapper
public interface ArticleMapper {
    /** 記事登録 */
    public int insertOne(MArticle article);

    /** 記事取得 */
    public List<MArticle> findMany();

    /** 記事1件取得 */
    public MArticle findOne(int id);

    /** 記事削除(1件) */
    public int deleteOne(@Param("id") int id);

    /** 記事編集(1件) */
    public void updateOne(@Param("id") int id,
        @Param("circle_id") int circle_id,
        @Param("title") String title,
        @Param("body") String body);
}

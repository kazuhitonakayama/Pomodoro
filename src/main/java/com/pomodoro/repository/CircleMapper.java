package com.pomodoro.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pomodoro.domain.circle.model.MCircle;
import java.util.List;

@Mapper
public interface CircleMapper {
    // /** 記事登録 */
    // public int insertOne(MArticle article);

    // /** 記事取得 */
    // public List<MArticle> findMany();

    /** サークル1件取得 */
    public MCircle findCircleName(int id);

    // /** 記事削除(1件) */
    // public int deleteOne(@Param("id") int id);

    // /** 記事編集(1件) */
    // public void updateOne(@Param("id") int id,
    //     @Param("circle_id") int circle_id,
    //     @Param("title") String title,
    //     @Param("body") String body);
}

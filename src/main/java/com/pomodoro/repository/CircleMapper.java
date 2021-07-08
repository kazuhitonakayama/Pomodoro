package com.pomodoro.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pomodoro.domain.circle.model.MCircle;
import java.util.List;

@Mapper
public interface CircleMapper {
     /** 部活登録 */
     public int insertOne(MCircle circle);

    // /** 記事取得 */
    public List<MCircle> findMany();

   /** サークル1件取得 */
   public MCircle findCircleOne(int id);

    // /** 記事削除(1件) */
    // public int deleteOne(@Param("id") int id);

    /** 記事編集(1件) */
    public void updateOne(@Param("id") int id,
        @Param("circleName") String circleName,
        @Param("description") String description);
}

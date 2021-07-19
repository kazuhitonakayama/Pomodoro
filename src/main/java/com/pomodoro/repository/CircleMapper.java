package com.pomodoro.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.pomodoro.domain.circle.model.MCircle;
import com.pomodoro.domain.article.model.MArticle;
import java.util.List;

@Mapper
public interface CircleMapper {
     /** 部活登録 */
     public int insertOne(MCircle circle);

    // /** 記事取得 */
    public List<MCircle> findMany();

    // /** 非表示サークル取得 */
    public List<MCircle> findInactive();

    /** サークル1件取得 */
    public MCircle findCircleOne(int id);

    /** サークルの活動一覧の取得 */
    public List<MArticle> findArticlesOfCircle(int id);

    /** サークルの名前の取得 @ サークル詳細ページ */
    public String findCircleName(int id);

    /** サークル削除(1件) */
    public int deleteOne(@Param("id") int id);

    /** サークル編集(1件) */
    public void updateOne(@Param("id") int id,
        @Param("circleName") String circleName,
        @Param("description") String description,
        @Param("isActive") Boolean isActive);
}

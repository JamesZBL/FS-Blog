package me.zbl.fullstack.mapper;

import java.util.List;
import me.zbl.fullstack.entity.TagArticle;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface TagArticleMapper {
    @Delete({
        "delete from tag_article",
        "where tag_id = #{tagId,jdbcType=INTEGER}",
          "and article_id = #{articleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("tagId") Integer tagId, @Param("articleId") Integer articleId);

    @Insert({
        "insert into tag_article (tag_id, article_id)",
        "values (#{tagId,jdbcType=INTEGER}, #{articleId,jdbcType=INTEGER})"
    })
    int insert(TagArticle record);

    @Select({
        "select",
        "tag_id, article_id",
        "from tag_article"
    })
    @Results({
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<TagArticle> selectAll();
}
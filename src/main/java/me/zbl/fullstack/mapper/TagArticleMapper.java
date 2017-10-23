package me.zbl.fullstack.mapper;

import java.util.List;
import me.zbl.fullstack.entity.TagArticle;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TagArticleMapper {
    @Delete({
        "delete from tag_article",
        "where tag_id = #{tagId,jdbcType=INTEGER}",
          "and article_id = #{articleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("tagId") Integer tagId, @Param("articleId") Integer articleId);

    @Insert({
        "insert into tag_article (tag_id, article_id, ",
        "gmt_create, gmt_modified)",
        "values (#{tagId,jdbcType=INTEGER}, #{articleId,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP})"
    })
    int insert(TagArticle record);

    @Select({
        "select",
        "tag_id, article_id, gmt_create, gmt_modified",
        "from tag_article",
        "where tag_id = #{tagId,jdbcType=INTEGER}",
          "and article_id = #{articleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    TagArticle selectByPrimaryKey(@Param("tagId") Integer tagId, @Param("articleId") Integer articleId);

    @Select({
        "select",
        "tag_id, article_id, gmt_create, gmt_modified",
        "from tag_article"
    })
    @Results({
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TagArticle> selectAll();

    @Update({
        "update tag_article",
        "set gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP}",
        "where tag_id = #{tagId,jdbcType=INTEGER}",
          "and article_id = #{articleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TagArticle record);
}
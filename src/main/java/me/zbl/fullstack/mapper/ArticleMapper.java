package me.zbl.fullstack.mapper;

import java.util.List;
import me.zbl.fullstack.entity.Article;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ArticleMapper {
    @Delete({
        "delete from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into article (title, ",
        "introduction, ",
        "md_material)",
        "values (#{title,jdbcType=VARCHAR},",
        "#{mdMaterial,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Article record);

    @Select({
        "select",
        "id, title, gmt_create, gmt_modified, introduction, md_material",
        "from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_material", property="mdMaterial", jdbcType=JdbcType.LONGVARCHAR)
    })
    Article selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, title, gmt_create, gmt_modified, introduction, md_material",
        "from article"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_material", property="mdMaterial", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Article> selectAll();

    @Update({
        "update article",
        "set title = #{title,jdbcType=VARCHAR},",
          "introduction = #{introduction,jdbcType=LONGVARCHAR},",
          "md_material = #{mdMaterial,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}
package me.zbl.fullstack.mapper;

import java.util.List;
import me.zbl.fullstack.entity.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ArticleMapper {
    @Delete({
        "delete from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into article (create_datetime, title, ",
        "gmt_create, gmt_modified, ",
        "introduction, md_material)",
        "values (#{createDatetime,jdbcType=TIMESTAMP}, #{title,jdbcType=VARCHAR}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP}, ",
        "#{introduction,jdbcType=LONGVARCHAR}, #{mdMaterial,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Article record);

    @Select({
        "select",
        "id, create_datetime, title, gmt_create, gmt_modified, introduction, md_material",
        "from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_datetime", property="createDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_material", property="mdMaterial", jdbcType=JdbcType.LONGVARCHAR)
    })
    Article selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, create_datetime, title, gmt_create, gmt_modified, introduction, md_material",
        "from article"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_datetime", property="createDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_material", property="mdMaterial", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Article> selectAll();

    @Update({
        "update article",
        "set create_datetime = #{createDatetime,jdbcType=TIMESTAMP},",
          "title = #{title,jdbcType=VARCHAR},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP},",
          "introduction = #{introduction,jdbcType=LONGVARCHAR},",
          "md_material = #{mdMaterial,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}
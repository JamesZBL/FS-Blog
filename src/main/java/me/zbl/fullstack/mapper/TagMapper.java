package me.zbl.fullstack.mapper;

import java.util.List;
import me.zbl.fullstack.entity.Tag;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TagMapper {
    @Delete({
        "delete from tag",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tag (name",
        ")",
        "values (#{name,jdbcType=VARCHAR} ",
        ")"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Tag record);

    @Select({
        "select",
        "id, name, gmt_create, gmt_modified",
        "from tag",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    Tag selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, name, gmt_create, gmt_modified",
        "from tag"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Tag> selectAll();

    @Update({
        "update tag",
        "set name = #{name,jdbcType=VARCHAR},",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tag record);
}
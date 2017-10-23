package me.zbl.fullstack.mapper.temp;

import java.util.List;
import me.zbl.fullstack.entity.temp.AdminUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AdminUserMapper {
    @Delete({
        "delete from admin_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into admin_user (username, password, ",
        "birth_date, nickname, ",
        "email, github, qq, ",
        "wecaht, avatar, ",
        "gmt_create, gmt_modified, ",
        "hobby, motto, ",
        "md_info)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{birthDate,jdbcType=DATE}, #{nickname,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{github,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, ",
        "#{wecaht,jdbcType=VARCHAR}, #{avatar,jdbcType=VARCHAR}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP}, ",
        "#{hobby,jdbcType=LONGVARCHAR}, #{motto,jdbcType=LONGVARCHAR}, ",
        "#{mdInfo,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AdminUser record);

    @Select({
        "select",
        "id, username, password, birth_date, nickname, email, github, qq, wecaht, avatar, ",
        "gmt_create, gmt_modified, hobby, motto, md_info",
        "from admin_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="github", property="github", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="wecaht", property="wecaht", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="hobby", property="hobby", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="motto", property="motto", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_info", property="mdInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    AdminUser selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, username, password, birth_date, nickname, email, github, qq, wecaht, avatar, ",
        "gmt_create, gmt_modified, hobby, motto, md_info",
        "from admin_user"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="github", property="github", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="wecaht", property="wecaht", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="hobby", property="hobby", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="motto", property="motto", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="md_info", property="mdInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<AdminUser> selectAll();

    @Update({
        "update admin_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "birth_date = #{birthDate,jdbcType=DATE},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "github = #{github,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "wecaht = #{wecaht,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP},",
          "hobby = #{hobby,jdbcType=LONGVARCHAR},",
          "motto = #{motto,jdbcType=LONGVARCHAR},",
          "md_info = #{mdInfo,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AdminUser record);
}
package me.zbl.fullstack.mapper.bak;

import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.entity.vo.UserRegisterForm;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//@Mapper
public interface UserMapper {
    @Delete({
            "delete from user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into user (username, password, ",
            "birth_date, nickname, ",
            "email, github, qq, ",
            "wecaht, avatar, ",
            "status, level, ",
            "hobby, ",
            "motto, md_info)",
            "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
            "#{birthDate,jdbcType=DATE}, #{nickname,jdbcType=VARCHAR}, ",
            "#{email,jdbcType=VARCHAR}, #{github,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, ",
            "#{wecaht,jdbcType=VARCHAR}, #{avatar,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=INTEGER}, #{level,jdbcType=INTEGER},  ",
            "#{hobby,jdbcType=LONGVARCHAR}, ",
            "#{motto,jdbcType=LONGVARCHAR}, #{mdInfo,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(User record);

    @Select({
            "select",
            "id, username, password, birth_date, nickname, email, github, qq, wecaht, avatar, ",
            "status, level, gmt_create, gmt_modified, hobby, motto, md_info",
            "from user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "birth_date", property = "birthDate", jdbcType = JdbcType.DATE),
            @Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "github", property = "github", jdbcType = JdbcType.VARCHAR),
            @Result(column = "qq", property = "qq", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wecaht", property = "wecaht", jdbcType = JdbcType.VARCHAR),
            @Result(column = "avatar", property = "avatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "hobby", property = "hobby", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "motto", property = "motto", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "md_info", property = "mdInfo", jdbcType = JdbcType.LONGVARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, username, password, birth_date, nickname, email, github, qq, wecaht, avatar, ",
            "status, level, gmt_create, gmt_modified, hobby, motto, md_info",
            "from user"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "birth_date", property = "birthDate", jdbcType = JdbcType.DATE),
            @Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "github", property = "github", jdbcType = JdbcType.VARCHAR),
            @Result(column = "qq", property = "qq", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wecaht", property = "wecaht", jdbcType = JdbcType.VARCHAR),
            @Result(column = "avatar", property = "avatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "hobby", property = "hobby", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "motto", property = "motto", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "md_info", property = "mdInfo", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<User> selectAll();

    @Update({
            "update user",
            "set username = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "birth_date = #{birthDate,jdbcType=DATE},",
            "nickname = #{nickname,jdbcType=VARCHAR},",
            "email = #{email,jdbcType=VARCHAR},",
            "github = #{github,jdbcType=VARCHAR},",
            "qq = #{qq,jdbcType=VARCHAR},",
            "wecaht = #{wecaht,jdbcType=VARCHAR},",
            "avatar = #{avatar,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "level = #{level,jdbcType=INTEGER},",
            "hobby = #{hobby,jdbcType=LONGVARCHAR},",
            "motto = #{motto,jdbcType=LONGVARCHAR},",
            "md_info = #{mdInfo,jdbcType=LONGVARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);

    @Select({
            "select",
            "id, username, password, nickname, email, github, qq, wecaht, avatar, ",
            "birth_date, status, level, gmt_create, gmt_modified, hobby, motto, md_info",
            "from user",
            "where username = #{username,jdbcType=VARCHAR}",
            "and password = MD5(#{password,jdbcType=VARCHAR})"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "github", property = "github", jdbcType = JdbcType.VARCHAR),
            @Result(column = "qq", property = "qq", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wecaht", property = "wecaht", jdbcType = JdbcType.VARCHAR),
            @Result(column = "avatar", property = "avatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "birth_date", property = "birthDate", jdbcType = JdbcType.DATE),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "hobby", property = "hobby", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "motto", property = "motto", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "md_info", property = "mdInfo", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<User> selectByNameAndPassword(UserLoginForm loginForm);

    @Select({
            "select",
            "id, username, password, nickname, email, github, qq, wecaht, avatar, ",
            "birth_date, status, level, gmt_create, gmt_modified, hobby, motto, md_info",
            "from user",
            "where username = #{username,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "github", property = "github", jdbcType = JdbcType.VARCHAR),
            @Result(column = "qq", property = "qq", jdbcType = JdbcType.VARCHAR),
            @Result(column = "wecaht", property = "wecaht", jdbcType = JdbcType.VARCHAR),
            @Result(column = "avatar", property = "avatar", jdbcType = JdbcType.VARCHAR),
            @Result(column = "birth_date", property = "birthDate", jdbcType = JdbcType.DATE),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "level", property = "level", jdbcType = JdbcType.INTEGER),
            @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "hobby", property = "hobby", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "motto", property = "motto", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "md_info", property = "mdInfo", jdbcType = JdbcType.LONGVARCHAR)
    })
    List<User> selectByName(UserRegisterForm registerForm);
}
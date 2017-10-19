package me.zbl.fullstack.mapper;

import me.zbl.fullstack.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select({
            "select username,password,qq",
            "from admin"
    })
    List<User> selectAllUser();
}

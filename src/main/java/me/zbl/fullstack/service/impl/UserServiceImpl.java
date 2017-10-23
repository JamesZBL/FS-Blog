package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.mapper.UserMapper;
import me.zbl.fullstack.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginAuthentication(UserLoginForm loginForm) {
        List<User> userList = userMapper.selectByNameAndPassword(loginForm);
        if (null != userList && userList.size() == 1) {
            return userList.get(0);
        }
        return null;
    }
}

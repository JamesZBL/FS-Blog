package me.zbl.fullstack.service.api;


import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;

import java.util.List;

public interface UserService {
    User loginAuthentication(UserLoginForm loginForm);
}

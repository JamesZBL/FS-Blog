package me.zbl.fullstack.service.api;


import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    User loginAuthentication(UserLoginForm loginForm);

    void joinSession(HttpServletRequest request, User user);
}

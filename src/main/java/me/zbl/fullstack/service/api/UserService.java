package me.zbl.fullstack.service.api;


import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.entity.vo.UserRegisterForm;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    User loginAuthentication(UserLoginForm loginForm);

    List<User> registerUsernameCheck(UserRegisterForm registerForm);

    void insertUser(User user);

    void joinSession(HttpServletRequest request, User user);
}

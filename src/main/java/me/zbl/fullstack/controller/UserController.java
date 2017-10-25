package me.zbl.fullstack.controller;

import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.entity.vo.UserRegisterForm;
import me.zbl.fullstack.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * 用户登录控制器
 *
 * @author James
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private UserService mUserService;

    /**
     * 前台用户登录
     * 表单提交
     */
    @PostMapping("/userlogin.f")
    public String fFrontUserLogin(HttpServletRequest request, Model model, @Valid UserLoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            return "redirect:/userlogin?msg=" + errors.get(0).getDefaultMessage();
        }
        User user = mUserService.loginAuthentication(loginForm);
        if (null != user) {
            mUserService.joinSession(request, user);
            model.addAttribute(ViewConsts.VIEW_USERINFO, user);
            return "redirect:/index";
        }
        return "redirect:/userlogin?msg=登录失败";
    }

    /**
     * 前台用户注册
     * 表单提交
     */
    @PostMapping("/userregister.f")
    public String fFrontUserRegister(HttpServletRequest request, Model model, @Valid UserRegisterForm registerForm, User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            return "redirect:/register?msg=" + errors.get(0);
        }
        //再次进行重名校验
        if (mUserService.registerUsernameCheckExist(registerForm)) {
            return "redirect:/register?msg=" + "用户名已存在";
        }
        //再次进行密码一致校验
        if (registerForm.getUsername() != registerForm.getConfirmpassword()) {
            return "redirect:/register?msg=" + "两次输入的密码不一致";
        }
        mUserService.insertUser(user);
        return "forward:/userlogin.f";
    }
}

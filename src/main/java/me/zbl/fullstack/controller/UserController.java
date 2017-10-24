package me.zbl.fullstack.controller;

import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 前台页面控制器
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
    public String fFrontUserLogin(HttpServletRequest request, Model model, UserLoginForm loginForm, BindingResult bindingResult) {
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
}

package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 后台控制器
 *
 * @author James
 */
@Controller
public class AdminController extends BaseController {

    /**
     * 后台首页
     */
    @GetMapping("/admin/index")
    public String pAdminIndex() {
        return "admin/index";
    }

    /**
     * 后台用户登录页面
     */
    @GetMapping("/admin/login")
    public String pAdminLogin() {
        return "admin/userlogin";
    }

    /**
     * 后台用户登录验证
     */
    @PostMapping("/admin/login.f")
    public String fAdminLogin(UserLoginForm userLoginForm) {
        // TODO: 17-11-5 后台用户登录验证
        return "redirect:admin/index";
    }
}

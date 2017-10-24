package me.zbl.fullstack.controller;

import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

/**
 * 前台页面控制器
 *
 * @author James
 */
@Controller
public class FrontController extends BaseController {

    @Autowired
    private UserService mUserService;

    /**
     * 前台首页
     */
    @GetMapping("/")
    public String pFrontRoot(Model model) {
        model.addAttribute(ViewConsts.VIEW_TITLE, ViewConsts.INDEX_PAGE_TITLE);
        return "index";
    }

    /**
     * 前台首页
     */
    @GetMapping("/index")
    public String pFrontIndex(Model model) {
        model.addAttribute(ViewConsts.VIEW_TITLE, ViewConsts.INDEX_PAGE_TITLE);
        return "index";
    }

    /**
     * 前台用户登录页
     */
    @GetMapping("/userlogin")
    public String pFrontUserLogin(Model model) {
        return "userlogin";
    }

    /**
     * 前台用户注册
     */
    @GetMapping("/userregister")
    public String pFrontUserRegister(Model model) {
        return "register";
    }
}

package me.zbl.fullstack.controller;

import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 前台页面控制器
 *
 * @author James
 */
@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
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
     * 前台用户登录
     * 表单提交
     */
    @PostMapping("/userlogin.f")
    public String fFrontUserLogin(Model model, UserLoginForm loginForm) {
        User user = mUserService.loginAuthentication(loginForm);
        if (null != user) {
            model.addAttribute(ViewConsts.VIEW_USERINFO, user);
            return "redirect:/index";
        }
        return "redirect:/userlogin?msg=登录失败";
    }
}

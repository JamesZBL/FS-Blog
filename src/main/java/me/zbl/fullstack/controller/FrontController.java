package me.zbl.fullstack.controller;

import me.zbl.fullstack.consts.SessionConstants;
import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 前台页面控制器
 *
 * @author James
 */
@Controller
public class FrontController extends BaseController {

    /**
     * 前台首页
     */
    @GetMapping("/")
    public String pFrontRoot(Model model) {
        model.addAttribute(ViewConsts.VIEW_TITLE, ViewConsts.INDEX_PAGE_TITLE);
        return "index";
    }

    /**
     * 错误页
     */
    @GetMapping("error")
    public String pErrorPage() {
        return "error";
    }

    /**
     * 前台首页
     * GET
     */
    @GetMapping("/index")
    public String pFrontIndex(HttpServletRequest request, Model model) {
        model.addAttribute(ViewConsts.VIEW_TITLE, ViewConsts.INDEX_PAGE_TITLE);
        try {
            User user = (User) getSessionAttr(request, SessionConstants.SESSION_CURRENT_USER);
            model.addAttribute(ViewConsts.VIEW_USERINFO, user);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return "index";
    }

    /**
     * 前台首页
     * POST
     */
    @PostMapping("/index")
    public String pFrontIndexPost(Model model) {
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

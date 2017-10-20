package me.zbl.fullstack.controller;

import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 前台页面控制器
 */
@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class FrontController extends BaseController{

    /**
     * 前台首页
     */
    @RequestMapping(value = "/index")
    public String pFrontIndex(Model model) {
//        setPageTitle(model, ViewConsts.INDEX_PAGE_TITLE);
        model.addAttribute("title","title");
        return "index";
    }
}

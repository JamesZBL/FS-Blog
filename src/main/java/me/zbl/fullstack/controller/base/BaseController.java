package me.zbl.fullstack.controller.base;

import org.springframework.ui.Model;

/**
 * 控制器基类
 */
public class BaseController {

    /**
     * 给页面添加标题
     * @param model
     * @param title
     */
    public void setPageTitle(Model model, String title){
        model.addAttribute("title",title);
    }
}

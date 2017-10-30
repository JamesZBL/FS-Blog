package me.zbl.fullstack.controller.base;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制器基类
 */
public class BaseController {

    /**
     * 给页面添加标题
     */
    public void setPageTitle(Model model, String title) {
        model.addAttribute("title", title);
    }

    /**
     * 根据名称获取 Session 中的属性值
     */
    public Object getSessionAttr(HttpServletRequest request, String attrName) throws NullPointerException {
        return request.getSession().getAttribute(attrName);
    }
}

package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}

package me.zbl.fullstack.controller;

import me.zbl.fullstack.annotation.PageTitle;
import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.service.api.IAdminBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 前台页面控制器
 *
 * @author James
 */
@Controller
public class FrontController extends BaseController {

  @Autowired
  private IAdminBlogService mBlogService;

  /**
   * 前台首页
   */
  @GetMapping("/")
  @PageTitle(name = ViewConsts.INDEX_PAGE_TITLE)
  public String pFrontRoot(Model model) {
    return "index";
  }

  /**
   * 错误页
   */
  @GetMapping("/error")
  public String pErrorPage(HttpServletRequest request, Model model) {
    return "error";
  }

  /**
   * 前台首页
   * GET
   */
  @GetMapping("/index")
  @PageTitle(name = ViewConsts.INDEX_PAGE_TITLE)
  public String pFrontIndex(HttpServletRequest request, Model model) {
    return "index";
  }

  /**
   * 前台首页
   * POST
   */
  @PostMapping("/index")
  @PageTitle(name = ViewConsts.INDEX_PAGE_TITLE)
  public String pFrontIndexPost(Model model) {
    return "index";
  }

  /**
   * 前台用户登录页
   */
  @GetMapping("/userlogin")
  public String pFrontUserLogin(HttpServletRequest request, Model model) {
    return "userlogin";
  }

  /**
   * 前台用户注册
   */
  @GetMapping("/userregister")
  public String pFrontUserRegister(HttpServletRequest request, Model model) {
    return "register";
  }

  @GetMapping("/blog/{id}")
  public String pFrontBlogView(HttpServletRequest request, Model model, @PathVariable Integer id) throws Exception {
    Article article = mBlogService.blogSelectByPrimaryKey(id);
    addModelAtt(model, "articleTitle", article.getTitle());
    addModelAtt(model, "articleMd", article.getHtmlMaterial());
    return"article";
}
}

package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.dto.ArticleDeleteModel;
import me.zbl.fullstack.entity.vo.BlogAddForm;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.service.api.IAdminBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 后台控制器
 *
 * @author James
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

  @Autowired
  IAdminBlogService mBlogService;

  /**
   * 后台首页
   */
  @GetMapping("")
  public String pAdminIndex(HttpServletRequest request, Model model) {
    return "admin/index";
  }

  /**
   * 后台首页
   */
  @GetMapping("/index")
  public String pAdminIndex2(HttpServletRequest request, Model model) {
    return "admin/index";
  }

  /**
   * 后台用户登录页面
   */
  @GetMapping("/login")
  public String pAdminLogin(HttpServletRequest request, Model model) {
    return "admin/userlogin";
  }

  /**
   * 写博客页面
   */
  @GetMapping("/blogadd")
  public String pAdminBlogAdd(HttpServletRequest request, Model model) {
    return "admin/blogadd";
  }

  /**
   * 博客管理页面
   */
  @GetMapping("/blogmanage")
  public String pAdminBlogManage(HttpServletRequest request, Model model) {
    return "admin/blog_manage";
  }

  /**
   * 后台用户登录验证
   */
  @PostMapping("/login.f")
  public String fAdminLogin(UserLoginForm userLoginForm) {
    return "redirect:/admin/index";
  }

  /**
   * 发布文章
   */
  @PostMapping("/blogadd.f")
  public String fAdminBlogAdd(BlogAddForm blogAddForm) {
    // TODO: 17-12-4 返回 json ，成功则重定向到博客列表
    mBlogService.blogAdd(blogAddForm);
    return "redirect:/admin/index";
  }


  /**
   * 获取博客详情列表
   */
  @GetMapping("/blog_list.j")
  @ResponseBody
  public Object jAdminBlogList() {
    return mBlogService.getArticleList();
  }

  /**
   * 批量删除博客
   */
  @DeleteMapping("/blog_delete.j")
  @ResponseBody
  public Object jAdminBlogDelete(@RequestBody ArticleDeleteModel model) {
    mBlogService.blogDelete(model);
    return mJsonFactory.getSimpleResponse();
  }
}

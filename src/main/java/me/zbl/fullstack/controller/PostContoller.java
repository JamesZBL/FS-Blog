package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.view.PostView;
import me.zbl.fullstack.service.api.IAdminBlogService;
import me.zbl.fullstack.service.api.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static me.zbl.fullstack.consts.ViewConsts.*;

/**
 * 博客控制器
 * 查询博客列表
 * <p>
 * Created by James on 17-12-7.
 */
@Controller
public class PostContoller extends BaseController {

  @Autowired
  IPostsService mPostService;

  @Autowired
  private IAdminBlogService mBlogService;

  /**
   * 博客列表页
   */
  @GetMapping("/post")
  public String postList(HttpServletRequest request, Model model) throws Exception {
    List<PostView> postViewList = mPostService.getPostList();
    addModelAtt(model, VIEW_POSTLIST, postViewList);
    return "posts";
  }

  /**
   * 查看文章内容页
   *
   * @param id 文章 id
   */
  @GetMapping("/blog/{id}")
  public String pFrontBlogView(HttpServletRequest request, Model model, @PathVariable Integer id) throws Exception {
    Article article = mBlogService.blogSelectByPrimaryKey(id);
    PostView postView = new PostView(article);
    addModelAtt(model, VIEW_ARTICLE, postView);
    addModelAtt(model, VIEW_TITLE, article.getTitle());
    return "article";
  }
}

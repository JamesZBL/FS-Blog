package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.view.PostView;
import me.zbl.fullstack.service.api.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static me.zbl.fullstack.consts.ViewConsts.VIEW_POSTLIST;

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

  /**
   * 博客列表页
   */
  @GetMapping("/post")
  public String postList(HttpServletRequest request, Model model) throws Exception {
    List<PostView> postViewList = mPostService.getPostList();
    addModelAtt(model, VIEW_POSTLIST, postViewList);
    return "posts";
  }
}

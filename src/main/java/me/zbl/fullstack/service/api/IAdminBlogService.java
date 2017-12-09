package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.vo.BlogAddForm;

import java.util.List;

/**
 * 后台博客发布接口
 * <p>
 * Created by James on 17-12-4.
 */
public interface IAdminBlogService {

  void blogAdd(BlogAddForm form);

  Article blogSelectByPrimaryKey(Integer id);

  /* 后台 */

  /**
   * 获取所有文章列表
   */
  List<Article> getArticleList();
}

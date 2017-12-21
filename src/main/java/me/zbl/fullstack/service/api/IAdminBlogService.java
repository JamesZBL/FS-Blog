package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.dto.ArticleDataGridView;
import me.zbl.fullstack.entity.dto.ArticleDeleteModel;
import me.zbl.fullstack.entity.vo.BlogAddForm;
import me.zbl.fullstack.entity.vo.BlogModifyForm;

import java.util.List;

/**
 * 后台博客发布接口
 * <p>
 * Created by James on 17-12-4.
 */
public interface IAdminBlogService {

  /**
   * 添加 文章
   */
  void blogAdd(BlogAddForm form);

  /**
   * 根据 id 获取文章
   */
  Article blogSelectByPrimaryKey(Integer id);

  /**
   * 获取所有文章列表
   */
  List<ArticleDataGridView> getArticleList();

  /**
   * 根据 id 删除文章
   */
  void blogDelete(ArticleDeleteModel model);

  /**
   * 修改已发布文章
   */
  void blogModify(BlogModifyForm form);
}

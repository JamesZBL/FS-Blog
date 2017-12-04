package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.vo.BlogAddForm;
import me.zbl.fullstack.mapper.ArticleMapper;
import me.zbl.fullstack.service.api.IAdminBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 后台博客服务实现类
 * <p>
 * Created by James on 17-12-4.
 */
@Service
public class AdminBlogServiceImpl implements IAdminBlogService {

  @Autowired
  ArticleMapper mArticleMapper;

  @Override
  public void blogAdd(BlogAddForm form) {
    Article article = new Article();
    article.setTitle(form.getTitle());
    article.setMdMaterial(form.getMdMaterial());
    mArticleMapper.insertSelective(article);
  }
}

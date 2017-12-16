package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.Tag;
import me.zbl.fullstack.entity.TagArticle;
import me.zbl.fullstack.entity.dto.ArticleDeleteModel;
import me.zbl.fullstack.entity.vo.BlogAddForm;
import me.zbl.fullstack.entity.vo.BlogModifyForm;
import me.zbl.fullstack.mapper.ArticleMapper;
import me.zbl.fullstack.mapper.TagArticleMapper;
import me.zbl.fullstack.mapper.TagMapper;
import me.zbl.fullstack.service.api.IAdminBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 后台博客服务实现类
 * <p>
 * Created by James on 17-12-4.
 */
@Service
public class AdminBlogServiceImpl implements IAdminBlogService {

  @Autowired
  private ArticleMapper mArticleMapper;
  @Autowired
  private TagMapper mTagMapper;

  @Override
  @Transactional
  public void blogAdd(BlogAddForm form) {
    Article article = new Article();
    article.setTitle(form.getTitle());
    article.setMdMaterial(form.getMdMaterial());
    article.setHtmlMaterial(form.getHtmlMaterial());
    article.setIntroduction(form.getDescription());
    // 处理 article
    mArticleMapper.insertSelective(article);
    Integer article_id = article.getId();
    // 处理 tags
    String[] tags = form.getRawTags().split(",");
    List<Integer> tagIds = new ArrayList<>();
    for (int i = 0; i < tags.length; i++) {
      Tag tag = new Tag();
      tag.setName(tags[i]);
      mTagMapper.insertSelective(tag);
      Integer tagId = tag.getId();
      tagIds.add(tagId);
    }
    for (Integer tagId : tagIds) {
      TagArticle tagArticle = new TagArticle();
      tagArticle.setTagId(tagId);
      tagArticle.setArticleId(article_id);
      mTagArticleMapper.insertSelective(tagArticle);
    }
  }

  @Autowired
  private TagArticleMapper mTagArticleMapper;

  @Override
  public Article blogSelectByPrimaryKey(Integer id) {
    return mArticleMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Article> getArticleList() {
    return mArticleMapper.selectAll();
  }

  @Override
  @Transactional
  public void blogDelete(ArticleDeleteModel model) {
    List<Integer> idList = model.getIds();
    for (Integer id : idList) {
      mArticleMapper.deleteByPrimaryKey(id);
    }
  }

  @Override
  public void blogModify(BlogModifyForm form) {
    Article article = new Article();
    article.setId(form.getId());
    article.setIntroduction(form.getDescription());
    article.setHtmlMaterial(form.getHtmlMaterial());
    article.setMdMaterial(form.getMdMaterial());
    article.setTitle(form.getTitle());
    // 更新数据库中的信息
    mArticleMapper.updateByPrimaryKeySelective(article);
  }
}

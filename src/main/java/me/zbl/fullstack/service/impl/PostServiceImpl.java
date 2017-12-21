package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.dto.PostView;
import me.zbl.fullstack.entity.vo.ArticleSearchForm;
import me.zbl.fullstack.mapper.ArticleMapper;
import me.zbl.fullstack.service.api.IPostsService;
import me.zbl.fullstack.service.base.ViewTransableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 博客业务实现类
 * <p>
 * Created by James on 17-12-7.
 */
@Service
public class PostServiceImpl extends ViewTransableService<Article, PostView> implements IPostsService {

  @Autowired
  ArticleMapper mPostMapper;

  @Override
  public List<PostView> getPostList() {
    List<Article> articles = mPostMapper.selectAll();
    List<PostView> postViewList = transEntityToView(articles);
    return postViewList;
  }

  @Override
  @Deprecated
  public List<PostView> getPostListByDate(Date start, Date end) {
    return null;
  }

  @Override
  public List<PostView> getPostListByTagId(Integer tagId) {
    List<Article> articlelist = mPostMapper.getArticleListByTagId(tagId);
    List<PostView> postViewList = transEntityToView(articlelist);
    return postViewList;
  }

  @Override
  public List<PostView> getPostListByArticleCondition(ArticleSearchForm form) {
    Article article = new Article();
    article.setTitle(form.getName());
    List<Article> articleList = mPostMapper.getArticleListByCondition(form);
    return transEntityToView(articleList);
  }

  @Override
  protected List<PostView> transEntityToView(List<Article> entityList) {
    List<PostView> postViewsList = new ArrayList<>();
    Iterator it = entityList.iterator();
    while (it.hasNext()) {
      Article article = (Article) it.next();
      PostView postView = new PostView(article);
      postViewsList.add(postView);
    }
    return postViewsList;
  }
}

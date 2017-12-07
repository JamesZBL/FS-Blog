package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.view.PostView;
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
    List<PostView> postViewList = transEntitytoView(articles);
    return postViewList;
  }

  @Override
  @Deprecated
  public List<PostView> getPostListByDate(Date start, Date end) {
    return null;
  }

  /**
   * 将查询结果转换为视图需要内容
   *
   * @param entityList 数据库查询结果
   */
  @Override
  protected List<PostView> transEntitytoView(List<Article> entityList) {
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

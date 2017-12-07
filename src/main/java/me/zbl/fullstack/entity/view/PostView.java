package me.zbl.fullstack.entity.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.zbl.fullstack.entity.Article;

/**
 * 博客列表视图
 * <p>
 * Created by James on 17-12-7.
 */
@Getter
@Setter
@AllArgsConstructor
public class PostView {

  private String title;
  private String description;
  private String dateTime;

  /**
   * 拷贝构造方法
   *
   * @param article 文章
   */
  public PostView(Article article) {
    title = article.getTitle();
    description = article.getIntroduction();
    // TODO: 17-12-7 修改过时方法
    dateTime = article.getGmtCreate().toLocaleString();
  }
}

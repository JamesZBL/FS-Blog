package me.zbl.fullstack.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.zbl.fullstack.entity.Article;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * 博客列表视图
 * <p>
 * Created by James on 17-12-7.
 */
@Getter
@Setter
@AllArgsConstructor
public class PostView {

  private Integer id;
  private String title;
  private String description;
  private String dateTime;
  private String htmlMaterial;

  /**
   * 拷贝构造方法
   *
   * @param article 文章
   */
  public PostView(Article article) {
    id = article.getId();
    title = article.getTitle();
    description = article.getIntroduction();
    dateTime = DateFormatUtils.format(article.getGmtCreate(), "yyyy-MM-dd HH:mm");
    htmlMaterial = article.getHtmlMaterial();
  }
}

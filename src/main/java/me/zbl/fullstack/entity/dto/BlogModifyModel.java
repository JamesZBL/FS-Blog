package me.zbl.fullstack.entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.zbl.fullstack.entity.Article;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 修改博客表单
 * <p>
 *
 * @author James
 * @date 17-12-4
 */
@Setter
@Getter
@NoArgsConstructor
public class BlogModifyModel {

  @NotEmpty
  private Integer id;

  @NotEmpty
  private String title;

  private String mdMaterial;

  private String description;

  public BlogModifyModel(Article article) {
    this.id = article.getId();
    this.title = article.getTitle();
    this.mdMaterial = article.getMdMaterial();
    this.description = article.getIntroduction();
  }
}

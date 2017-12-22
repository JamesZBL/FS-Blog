package me.zbl.fullstack.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 查找文章表单
 *
 * @author James
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleSearchForm {

  /**
   * 文章标题
   */
  @NotEmpty
  private String name;
}

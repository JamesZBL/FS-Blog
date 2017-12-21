package me.zbl.fullstack.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 查找文章表单
 * <p>
 * Created by James on 17-12-17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleSearchForm {

  @NotEmpty
  private String name;          // 文章标题
}

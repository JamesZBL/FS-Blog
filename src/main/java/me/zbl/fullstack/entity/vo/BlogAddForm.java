package me.zbl.fullstack.entity.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 发布博客表单
 * <p>
 * Created by James on 17-12-4.
 */
@Setter
@Getter
@NoArgsConstructor
public class BlogAddForm {

  @NotEmpty
  private String title;

  private String mdMaterial;  // markdown 转 html 后的内容
}

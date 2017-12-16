package me.zbl.fullstack.entity.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 修改博客表单
 * <p>
 * Created by James on 17-12-4.
 */
@Setter
@Getter
@NoArgsConstructor
public class BlogModifyForm {

  @NotEmpty
  private Integer id;          // 所修改博客的 id

  @NotEmpty
  private String title;

  private String mdMaterial;  // markdown 内容

  private String htmlMaterial;  // markdown 转 html 后的内容

  private String description;   // 文章内容描述

  private String rawTags;       // 原始 tags
}

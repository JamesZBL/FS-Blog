package me.zbl.fullstack.entity.dto.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 修改简历表单
 *
 * @author James
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResumeModifyForm {

  /**
   * 所修改博客的 id
   */
  @NotEmpty
  private Integer id;

  /**
   * 文章标题
   */
  @NotEmpty
  private String title;
  /**
   * markdown 内容
   */
  private String mdMaterial;
  /**
   * markdown 转 html 后的内容
   */
  private String htmlMaterial;
  /**
   * 文章内容描述
   */
  private String description;

  /**
   * 原始 tags
   */
  private String rawTags;
}

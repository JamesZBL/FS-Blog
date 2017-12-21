package me.zbl.fullstack.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.zbl.fullstack.entity.Tag;

/**
 * 文章标签视图
 * Created by James on 17-12-9.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagView {

  private Integer tagId;
  private String tagName;
  private Integer articleCount;

  public TagView(Tag tag) {
    this.tagId = tag.getId();
    this.tagName = tag.getName();
  }
}

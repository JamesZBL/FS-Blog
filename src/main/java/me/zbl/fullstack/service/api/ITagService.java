package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.dto.TagView;

import java.util.List;

/**
 * 文章标签相关业务接口
 *
 * @author James
 */
public interface ITagService {

  /**
   * 获取所有 Tag 视图
   *
   * @return Tag 视图
   */
  List<TagView> getAllTagView();
}

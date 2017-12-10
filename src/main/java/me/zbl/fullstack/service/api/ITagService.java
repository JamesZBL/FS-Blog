package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.dto.TagView;

import java.util.List;

/**
 * 文章标签相关业务接口
 * Created by James on 17-12-9.
 */
public interface ITagService {

  List<TagView> getAllTagView();
}

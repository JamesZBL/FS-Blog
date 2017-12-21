package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.Tag;
import me.zbl.fullstack.entity.dto.TagView;
import me.zbl.fullstack.mapper.TagMapper;
import me.zbl.fullstack.service.api.ITagService;
import me.zbl.fullstack.service.base.ViewTransableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 文章标签相关业务实现类
 * Created by James on 17-12-9.
 */
@Service
public class TagServiceImpl extends ViewTransableService<Tag, TagView> implements ITagService {

  @Autowired
  TagMapper mTagMapper;

  @Override
  protected List<TagView> transEntityToView(List<Tag> entityList) {
    List<TagView> tagViews = new ArrayList<>();
    for (Tag tag : entityList) {
      TagView tagView = new TagView(tag);
      tagViews.add(tagView);
    }
    return tagViews;
  }

  @Override
  public List<TagView> getAllTagView() {
    return mTagMapper.selectAllTagView();
  }
}

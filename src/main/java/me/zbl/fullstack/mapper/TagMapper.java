package me.zbl.fullstack.mapper;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.Tag;
import me.zbl.fullstack.framework.mapper.IMyMapper;

public interface TagMapper extends IMyMapper<Tag> {

  Article selectArticleByTagId(Integer id);
}
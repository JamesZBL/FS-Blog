package me.zbl.fullstack.mapper;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.Tag;
import me.zbl.fullstack.framework.mapper.IMyMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TagMapper extends IMyMapper<Tag> {

  @Select("SELECT article.id,article.title,article.introduction,article.gmt_create AS gmtCreate,article.gmt_modified AS gmtModified"
                  + " FROM article,tag,tag_article"
                  + " WHERE article.id = tag_article.article_id AND tag.id = tag_article.tag_id"
                  + " AND tag.id = #{id}")
  List<Article> selectArticleByTagId(Integer id);
}
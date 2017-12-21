package me.zbl.fullstack.mapper;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.vo.ArticleSearchForm;
import me.zbl.fullstack.framework.mapper.IMyMapper;
import me.zbl.fullstack.mapper.provider.ArticleSQLProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface ArticleMapper extends IMyMapper<Article> {

  String columnList = "article.id,title,introduction,article.gmt_create AS gmtCreate,article.gmt_modified AS gmtModified";

  @Select({
                  "SELECT",
                  columnList,
                  "FROM article",
                  "INNER JOIN tag_article",
                  "ON tag_article.article_id = article.id",
                  "AND tag_article.tag_id=#{id}",
                  "ORDER BY article.gmt_create DESC"
          })
  List<Article> getArticleListByTagId(Integer id);

  @SelectProvider(type = ArticleSQLProvider.class, method = "getArticleByCondition")
  List<Article> getArticleListByCondition(ArticleSearchForm form);
}
package me.zbl.fullstack.mapper;

import me.zbl.fullstack.entity.Article;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author James
 * @date 17-12-26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleMapperTest {

  @Autowired
  ArticleMapper mArticleMapper;

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void getPostViewAllArticles() throws Exception {
    List<Article> articleList = mArticleMapper.getPostViewAllArticles();
    assertNotNull(articleList);
  }

}
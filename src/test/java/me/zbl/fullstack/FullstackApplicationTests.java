package me.zbl.fullstack;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.mapper.TagMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullstackApplicationTests {

  @Autowired
  TagMapper mTagmapper;

  @Test
  public void contextLoads() {

  }

  /**
   * 测试通过标签 id 查找文章
   */
  @Test
  public void testSelectArticleByTagName() {
    List<Article> article = mTagmapper.selectArticleByTagId(13);
    assertNotNull(article);
  }
}

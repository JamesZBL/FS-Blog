package me.zbl.fullstack;

import me.zbl.fullstack.entity.Article;
import me.zbl.fullstack.entity.dto.PostView;
import me.zbl.fullstack.entity.dto.TagView;
import me.zbl.fullstack.mapper.TagMapper;
import me.zbl.fullstack.service.api.IPostsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullstackApplicationTests {

  private static final Logger LOGGER = LoggerFactory.getLogger(FullstackApplicationTests.class);

  @Autowired
  TagMapper mTagmapper;
  @Autowired
  IPostsService mPostService;

  @Test
  public void contextLoads() {

  }

  /**
   * 测试通过标签 id 查找文章
   */
  @Test
  public void testSelectArticleByTagName() {
    Integer id = 13;
    List<Article> article = mTagmapper.selectArticleByTagId(id);
    assertNotNull(article);
  }


  /**
   * 测试获取所有 tagView
   */
  @Test
  public void testGetAllTagView() {
    List<TagView> tagViewList = mTagmapper.selectAllTagView();
    assertNotNull(tagViewList);
  }

  /**
   * 测试通过 tagId 获取所有文章
   */
  @Test
  public void testGetAllArticleByTagId() {
    Integer id = 17;
    List<PostView> postViewList = mPostService.getPostListByTagId(id);
    assertNotNull(postViewList);
  }
}

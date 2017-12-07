package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.view.PostView;

import java.util.Date;
import java.util.List;

/**
 * 博客服务接口
 * <p>
 * Created by James on 17-12-7.
 */
public interface IPostsService {

  /**
   * 获取所有博客
   */
  List<PostView> getPostList();

  /**
   * 根据日期条件获取博客
   *
   * @param start 起始时间
   * @param end   结束时间
   */
  List<PostView> getPostListByDate(Date start, Date end);
}

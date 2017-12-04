package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.vo.BlogAddForm;

/**
 * 后台博客发布接口
 * <p>
 * Created by James on 17-12-4.
 */
public interface IAdminBlogService {

  void blogAdd(BlogAddForm form);
}

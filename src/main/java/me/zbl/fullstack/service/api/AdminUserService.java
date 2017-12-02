package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.AdminUser;

/**
 * 后台用户服务
 * <p>
 * Created by James on 17-12-2.
 */
public interface AdminUserService {

  /**
   * 验证用户是否存在
   *
   * @param user 用户
   *
   * @return 是否存在
   */
  AdminUser checkAdminUserExist(AdminUser user);
}

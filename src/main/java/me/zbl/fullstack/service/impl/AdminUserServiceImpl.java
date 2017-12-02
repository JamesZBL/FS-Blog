package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.AdminUser;
import me.zbl.fullstack.mapper.AdminUserMapper;
import me.zbl.fullstack.service.api.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户服务实现类
 * <p>
 * Created by James on 17-12-2.
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

  @Autowired
  private AdminUserMapper mAdminUserMapper;

  @Override
  public AdminUser checkAdminUserExist(AdminUser user) {
    List<AdminUser> adminUsers = mAdminUserMapper.select(user);
    if (null != adminUsers && adminUsers.size() > 0) {
      return adminUsers.get(0);
    }
    return null;
  }
}

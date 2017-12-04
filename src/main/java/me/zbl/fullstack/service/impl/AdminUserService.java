package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.consts.SessionConstants;
import me.zbl.fullstack.entity.AdminUser;
import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.mapper.AdminUserMapper;
import me.zbl.fullstack.service.api.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 后台用户服务实现类
 * <p>
 * Created by James on 17-12-2.
 */
@Service
public class AdminUserService implements IAdminUserService {

  @Autowired
  private AdminUserMapper mAdminUserMapper;

  @Autowired
  private AdminUser adminUser;

  @Override
  public AdminUser checkAdminUserExist(UserLoginForm form) {
    adminUser.setUsername(form.getUsername());
    adminUser.setPassword(form.getPassword());
    List<AdminUser> adminUsers = mAdminUserMapper.select(adminUser);
    if (null != adminUsers && adminUsers.size() > 0) {
      return adminUsers.get(0);
    }
    return null;
  }

  @Override
  public void joinSession(HttpServletRequest request, AdminUser user) {
    HttpSession requestSession = request.getSession(true);
    requestSession.setAttribute(SessionConstants.SESSION_ADMIN_CURRENT_USER, user);
  }

  @Override
  public void destroySession(HttpServletRequest request) {
    HttpSession requestSession = request.getSession(true);
    requestSession.removeAttribute(SessionConstants.SESSION_ADMIN_CURRENT_USER);
  }
}

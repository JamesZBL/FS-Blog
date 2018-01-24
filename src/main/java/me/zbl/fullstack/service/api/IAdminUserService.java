package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.AdminUser;
import me.zbl.fullstack.entity.dto.TableKeyModel;
import me.zbl.fullstack.entity.vo.UserLoginForm;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 后台用户服务
 *
 * @author James
 */
public interface IAdminUserService {

  /**
   * 验证用户是否存在
   *
   * @param form 用户信息
   *
   * @return 是否存在
   */
  AdminUser checkAdminUserExist(UserLoginForm form);

  /**
   * 将用户信息加入会话
   *
   * @param request 用户请求
   * @param user    当前用户的信息
   */
  void joinSession(HttpServletRequest request, AdminUser user);

  /**
   * 从会话中销毁用户信息
   *
   * @param request 用户请求
   */
  void destroySession(HttpServletRequest request);

  /**
   * 获取后台用户列表
   *
   * @return 后台用户 json
   */
  List<AdminUser> getAdminUserJson();

  /**
   * 批量删除用户
   *
   * @param model 待删除用户主键
   */
  void deleteAdminUser(TableKeyModel model);
}

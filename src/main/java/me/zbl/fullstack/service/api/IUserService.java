package me.zbl.fullstack.service.api;


import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.entity.vo.UserRegisterForm;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户信息操作接口
 *
 * @author James
 */
public interface IUserService {

  /**
   * 进行登录验证
   *
   * @param loginForm 登录表单
   *
   * @return 如果验证通过返回 User 实体
   */
  User loginAuthentication(UserLoginForm loginForm);

  /**
   * 进行用户注册中的用户名重复校验
   *
   * @param registerForm 注册表单
   *
   * @return 该用户民是否存在
   */
  boolean registerUsernameCheckExist(UserRegisterForm registerForm);

  /**
   * 保存用户
   */
  void insertUser(User user);

  /**
   * 将用户信息加入会话
   *
   * @param user 当前用户的信息
   */
  void joinSession(HttpServletRequest request, User user);

  /**
   * 从会话中销毁用户信息
   */
  void destroySession(HttpServletRequest request);
}

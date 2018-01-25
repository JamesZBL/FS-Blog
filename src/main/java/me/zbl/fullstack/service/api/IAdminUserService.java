package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.AdminUser;
import me.zbl.fullstack.entity.dto.form.AdminUserPwdModifyForm;
import me.zbl.fullstack.entity.dto.request.TableKeyModel;
import me.zbl.fullstack.entity.dto.form.UserLoginForm;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 后台用户服务
 *
 * @author James
 */
public interface IAdminUserService {

  /**
   * 修改密码结果
   */
  enum ModifyPwdResult {
    /**
     * 两次密码不同
     */
    NOT_EQUAL("两次输入的密码不相同"),
    /**
     * 原密码错误
     */
    ORI_PWD_ERROR("原密码输入错误"),
    /**
     * 修改成功
     */
    SUCCESS("修改成功");

    String name;

    ModifyPwdResult(String name) {
      this.name = name;
    }
  }

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

  /**
   * 后台用户密码修改
   *
   * @param form    修改密码表单
   * @param request 请求，用于获取当前用户
   *
   * @return 修改结果
   */
  ModifyPwdResult modifyUserPwd(AdminUserPwdModifyForm form, HttpServletRequest request);
}

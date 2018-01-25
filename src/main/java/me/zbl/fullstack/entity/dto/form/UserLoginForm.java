package me.zbl.fullstack.entity.dto.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户登录表单
 *
 * @author James
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginForm {

  /**
   * 用户名
   */
  @NotEmpty(message = "用户名不能为空")
  private String username;

  /**
   * 密码
   */
  @NotEmpty(message = "密码不能为空")
  private String password;

  /**
   * 记住登录
   */
  private Integer rememberme;
}
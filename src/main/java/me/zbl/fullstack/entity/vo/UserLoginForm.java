package me.zbl.fullstack.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户登录表单
 * <p>
 * Created by James on 17-12-4.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginForm {

  @NotEmpty(message = "用户名不能为空")
  private String username;  // 用户名

  @NotEmpty(message = "密码不能为空")
  private String password;  // 密码

  private Integer rememberme; // 记住登录
}

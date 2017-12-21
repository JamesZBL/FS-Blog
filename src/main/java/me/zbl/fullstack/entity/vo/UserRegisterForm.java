package me.zbl.fullstack.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.zbl.fullstack.consts.DataConsts;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户注册表单
 * <p>
 * Created by James on 17-12-4.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterForm {

  @Length(max = DataConsts.USERNAME_MAX_LENGTH)
  @NotEmpty(message = "用户名不能为空")
  private String username;        // 用户名

  @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
  @NotEmpty(message = "密码不能为空")
  private String password;        // 密码

  @NotEmpty(message = "请再次确认密码")
  private String confirmpassword; // 确认密码
}

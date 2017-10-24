package me.zbl.fullstack.entity.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.zbl.fullstack.consts.DataConsts;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@NoArgsConstructor
@Getter
@Setter
public class UserRegisterForm {
    @Length(max = DataConsts.USERNAME_MAX_LENGTH)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @Length(max = DataConsts.PASSWORD_MAX_LENGTH)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @NotEmpty(message = "请再次确认密码")
    private String confirmpassword;
}

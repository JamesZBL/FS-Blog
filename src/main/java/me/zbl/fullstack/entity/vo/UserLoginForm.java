package me.zbl.fullstack.entity.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserLoginForm {
    private String username;
    private String password;
    private Integer rememberme;
}

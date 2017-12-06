package me.zbl.fullstack.entity.response;

import lombok.Getter;
import lombok.Setter;

/**
 * 登录返回 Json
 * Created by James on 17-12-6.
 */
@Setter
@Getter
public class LoginResponse extends GlobalResponse {

  private String rediRedirectURL;

  public LoginResponse(int resultCode, boolean hasError, String rediRedirectURL) {
    super(resultCode, hasError);
    setRediRedirectURL(rediRedirectURL);
  }
}

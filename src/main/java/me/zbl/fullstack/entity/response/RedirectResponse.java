package me.zbl.fullstack.entity.response;

import lombok.Getter;
import lombok.Setter;

/**
 * 登录返回 Json
 *
 * @author James
 */
@Setter
@Getter
public class RedirectResponse extends GlobalResponse {

  private String redirectURL;

  public RedirectResponse(int resultCode, boolean hasError, String redirectURL) {
    super(resultCode, hasError);
    setRedirectURL(redirectURL);
  }
}

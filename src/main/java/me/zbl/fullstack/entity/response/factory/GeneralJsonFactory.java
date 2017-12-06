package me.zbl.fullstack.entity.response.factory;

import me.zbl.fullstack.entity.response.LoginResponse;
import me.zbl.fullstack.entity.response.SimpleResponse;
import org.springframework.stereotype.Component;

import static me.zbl.fullstack.consts.StatusCode.*;

/**
 * 通用 Json 工厂类
 * Created by James on 17-12-6.
 */
@Component(value = "generalJsonFactory")
public class GeneralJsonFactory implements JsonFactory {

  /**
   * 通用正常响应
   */
  @Override
  public SimpleResponse getSimpleResponse() {
    return new SimpleResponse(RESPONSE_OK, NO_ERROR);
  }

  /**
   * 带参数的统一响应
   * param resultCode 状态码
   *
   * @param hasError 是否需异常
   */
  @Override
  public SimpleResponse getSimpleResponse(int resultCode, boolean hasError) {
    return new SimpleResponse(resultCode, hasError);
  }

  @Override
  public LoginResponse getLoginResponse(int resultCode, boolean hasError, String redirectURL) {
    return new LoginResponse(resultCode, hasError, redirectURL);
  }
}

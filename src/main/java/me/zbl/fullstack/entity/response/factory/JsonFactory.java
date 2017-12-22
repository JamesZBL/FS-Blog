package me.zbl.fullstack.entity.response.factory;

import me.zbl.fullstack.entity.response.RedirectResponse;
import me.zbl.fullstack.entity.response.SimpleResponse;


/**
 * Json 实体工厂类接口
 *
 * @author James
 */
public interface JsonFactory {

  /**
   * 获取简单响应实体
   *
   * @return 响应实体
   */
  SimpleResponse getSimpleResponse();

  /**
   * 获取简单错误实体
   *
   * @return 响应实体
   */
  SimpleResponse getSimpleErrorResponse();

  /**
   * 获取简单响应实体
   *
   * @param resultCode 结果状态码
   * @param hasError   是否含有错误
   *
   * @return 响应实体
   */
  SimpleResponse getSimpleResponse(int resultCode, boolean hasError);

  /**
   * 获取重定向响应实体
   *
   * @param resultCode  结果状态码
   * @param hasError    是否含有错误
   * @param redirectURL 重定向 url
   *
   * @return
   */
  RedirectResponse getRedirectResponse(int resultCode, boolean hasError, String redirectURL);
}

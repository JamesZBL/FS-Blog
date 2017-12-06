package me.zbl.fullstack.entity.response;

/**
 * 简单 Json 响应类
 * <p>
 * Created by James on 17-12-6.
 */
public class SimpleResponse extends GlobalResponse {

  public SimpleResponse(int resultCode, boolean hasError) {
    super(resultCode, hasError);
  }
}

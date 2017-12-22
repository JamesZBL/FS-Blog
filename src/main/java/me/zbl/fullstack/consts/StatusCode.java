package me.zbl.fullstack.consts;

/**
 * 响应状态常量类
 *
 * @author James
 */
public class StatusCode {

  // 是否异常
  public static final boolean WITH_ERROR = true;
  public static final boolean NO_ERROR = false;
  // 认证成功
  public static final int AUTH_PASS = 101;
  // 认证失败
  public static final int AUTH_FAIL = 102;
  // 接收成功
  public static final int RESPONSE_OK = 201;
  // 重定向
  public static final int REDIRECT = 302;
  // 查询失败
  public static final int QUERY_ERROR = 501;
  // 服务器异常
  public static final int SERVER_EXCEPTION = 502;
}

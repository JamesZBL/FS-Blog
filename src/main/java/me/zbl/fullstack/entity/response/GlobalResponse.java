package me.zbl.fullstack.entity.response;

import lombok.Getter;
import lombok.Setter;

/**
 * 统一 Json 范围实体类
 * <p>
 * Created by James on 17-12-6.
 */
@Getter
@Setter
public class GlobalResponse {

  protected int resultCode;
  protected boolean hasError;

  private GlobalResponse() {

  }

  public GlobalResponse(int resultCode, boolean hasError) {
    this.resultCode = resultCode;
    this.hasError = hasError;
  }
}

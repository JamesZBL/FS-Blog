package me.zbl.fullstack.entity.response.factory;

import me.zbl.fullstack.entity.response.RedirectResponse;
import me.zbl.fullstack.entity.response.SimpleResponse;


/**
 * Json 实体工厂类接口
 * <p>
 * Created by James on 17-12-6.
 */
public interface JsonFactory {

  SimpleResponse getSimpleResponse();

  SimpleResponse getSimpleResponse(int resultCode, boolean hasError);

  RedirectResponse getRedirectResponse(int resultCode, boolean hasError, String redirectURL);
}

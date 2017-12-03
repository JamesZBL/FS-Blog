package me.zbl.fullstack.aspect;

import me.zbl.fullstack.consts.SessionConstants;
import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.entity.User;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * 前台 Controller 通用切面
 * 用于向视图输出通用 Model
 * <p>
 * 通用 Model 指会话中所有前台页面都要用到的信息，包括 用户昵称等
 * <p>
 * Created by James on 17-12-3.
 */
@Component
@Aspect
public class FrontModelAspect {

  @Pointcut("execution(String me.zbl.fullstack.controller.FrontController.*(..,javax.servlet.http.HttpServletRequest,org.springframework.ui.Model,..)) && args(request,model)")
  private void frontView(HttpServletRequest request, Model model) {
  }

  @Before("frontView(request,model)")
  public void joinModel(HttpServletRequest request, Model model) {
    model.addAttribute(ViewConsts.VIEW_TITLE, ViewConsts.INDEX_PAGE_TITLE);
    try {
      User user = (User) request.getSession().getAttribute(SessionConstants.SESSION_CURRENT_USER);
      model.addAttribute(ViewConsts.VIEW_USERINFO, user);
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }

  }
}

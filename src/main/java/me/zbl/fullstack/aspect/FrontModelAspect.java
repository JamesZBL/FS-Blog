package me.zbl.fullstack.aspect;

import me.zbl.fullstack.consts.SessionConstants;
import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.User;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * 前台 Controller 通用切面
 * 用于向视图输出通用 Model
 * <p>
 * Created by James on 17-12-3.
 */
@Aspect
public class FrontModelAspect {

  @Pointcut("execution(String me.zbl.fullstack.controller.FrontController(..,javax.servlet.http.HttpServletRequest,org.springframework.ui.Model,..)) && args(request,model)")
  private void frontView(HttpServletRequest request, Model model) {
  }

//  @Around("frontView(request,model)")
  public void joinModel(Joinpoint jp, HttpServletRequest request, Model model) {
    model.addAttribute(ViewConsts.VIEW_TITLE, ViewConsts.INDEX_PAGE_TITLE);
    try {
      User user = (User) request.getSession().getAttribute(SessionConstants.SESSION_CURRENT_USER);
      model.addAttribute(ViewConsts.VIEW_USERINFO, user);
    } catch (NullPointerException e) {
      e.printStackTrace();
    }

  }
}

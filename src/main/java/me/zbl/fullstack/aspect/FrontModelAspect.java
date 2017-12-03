package me.zbl.fullstack.aspect;

import me.zbl.fullstack.annotation.PageTitle;
import me.zbl.fullstack.consts.SessionConstants;
import me.zbl.fullstack.consts.ViewConsts;
import me.zbl.fullstack.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

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

  /**
   * 前台控制器切点
   */
  @Pointcut("execution(String me.zbl.fullstack.controller.FrontController.*(..,javax.servlet.http.HttpServletRequest,org.springframework.ui.Model,..)) && args(request,model)")
  private void frontView(HttpServletRequest request, Model model) {
  }

  /**
   * 加入通用 Model
   */
  @Around("frontView(request,model)")
  public void joinModel(ProceedingJoinPoint jp, HttpServletRequest request, Model model) {

    try {
      // 拦截的对象
      Object object = jp.getTarget();
      // 拦截方法名
      Signature signature = jp.getSignature();
      String methodName = signature.getName();
      Class[] parameterTypes = ((MethodSignature) signature).getMethod().getParameterTypes();

      try {
        // 反射目标方法
        Method method = object.getClass().getDeclaredMethod(methodName, parameterTypes);
        // 获取注解
        PageTitle titleAnno = method.getDeclaredAnnotation(PageTitle.class);
        if (null != titleAnno) {
          String titleName = titleAnno.name();
          // 加入标题
          model.addAttribute(ViewConsts.VIEW_TITLE, titleName);
        }
      } catch (NoSuchMethodException e) {
        e.printStackTrace();
      }
      // 加入用户信息
      User user = (User) request.getSession().getAttribute(SessionConstants.SESSION_CURRENT_USER);
      model.addAttribute(ViewConsts.VIEW_USERINFO, user);
      // 执行目标方法
      jp.proceed();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }
}
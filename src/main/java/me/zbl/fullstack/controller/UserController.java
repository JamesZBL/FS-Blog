package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.entity.vo.UserRegisterForm;
import me.zbl.fullstack.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * 用户登录控制器
 *
 * @author James
 */
@Controller
public class UserController extends BaseController {

  @Autowired
  private IUserService mUserService;

  /**
   * 前台用户登录
   * 表单提交
   */
  @PostMapping("/userlogin.f")
  public String fFrontUserLogin(HttpServletRequest request, Model model, @Valid UserLoginForm loginForm, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      List<ObjectError> errors = bindingResult.getAllErrors();
      return "redirect:userlogin?msg=" + errors.get(0).getDefaultMessage();
    }
    User user = mUserService.loginAuthentication(loginForm);
    if (null != user) {
      mUserService.joinSession(request, user);
      return "redirect:index";
    }
    return "redirect:userlogin?msg=登录失败";
  }

  /**
   * 前台用户注册
   * 表单提交
   */
  @PostMapping("/userregister.f")
  public String fFrontUserRegister(@Valid UserRegisterForm registerForm, BindingResult bindingResult, HttpServletRequest request, Model model, User user) {
    if (bindingResult.hasErrors()) {
      List<ObjectError> errors = bindingResult.getAllErrors();
      return "redirect:userregister";
    }
    //再次进行重名校验
    if (mUserService.registerUsernameCheckExist(registerForm)) {
      return "redirect:userregister";
    }
    //再次进行密码一致校验
    if (!registerForm.getUsername().equals(registerForm.getConfirmpassword())) {
      return "redirect:userregister";
    }
    mUserService.insertUser(user);
    //直接用当前账号登录
    return "forward:userlogin.f";
  }

  @GetMapping("/usersignout.c")
  public String cFrontUserSignout(HttpServletRequest request) {
    mUserService.destroySession(request);
    return "redirect:index";
  }
}

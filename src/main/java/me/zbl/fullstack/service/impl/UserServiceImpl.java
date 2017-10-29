package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.consts.SessionConstants;
import me.zbl.fullstack.entity.User;
import me.zbl.fullstack.entity.vo.UserLoginForm;
import me.zbl.fullstack.entity.vo.UserRegisterForm;
import me.zbl.fullstack.mapper.UserMapper;
import me.zbl.fullstack.service.api.UserService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mUserMapper;

    @Override
    public User loginAuthentication(UserLoginForm loginForm) {
//        List<User> userList = mUserMapper.selectByNameAndPassword(loginForm);
//        if (null != userList && userList.size() == 1) {
//            return userList.get(0);
//        }


        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        List<User> userList = mUserMapper.selectByExample(loginForm);
        return null;
    }

    @Override
    public boolean registerUsernameCheckExist(UserRegisterForm registerForm) {
//        return mUserMapper.selectByName(registerForm).size() > 0;
        return false;
    }

    @Override
    public void insertUser(User user) {
        mUserMapper.insert(user);
    }

    @Override
    public void joinSession(HttpServletRequest request, User user) {
        HttpSession requestSession = request.getSession(true);
        requestSession.setAttribute(SessionConstants.SESSION_CURRENT_USER, user);
    }

    @Override
    public void save(Object model) {

    }

    @Override
    public void save(List models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Object model) {

    }

    @Override
    public Object findById(Integer id) {
        return null;
    }

    @Override
    public Object findBy(String property, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List findByIds(String ids) {
        return null;
    }

    @Override
    public List findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}

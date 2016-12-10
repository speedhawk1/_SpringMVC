package controller;

import dao.UserDao;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/4.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    private SqlSession sqlSession;
    private UserDao userDao;

    @Autowired
    public UserController(SqlSession sqlSession, UserDao userDao) {
        this.sqlSession = sqlSession;
        this.userDao = userDao;
    }

    @RequestMapping("create")
    private String create(User user) {
        userDao.create(user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        user = sqlSession.selectOne("user.login", user);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user", user);
            return "redirect:/book/query";
        } else {
            request.setAttribute("message", "invalid username or password.");
            return "/index.jsp";
        }
    }

    @RequestMapping("logout")
    private String logout() {
        session.invalidate();
        return "redirect:/index.jsp";
    }
}

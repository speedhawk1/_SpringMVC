package controller;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

/**
 * Created by Administrator on 2016/12/4.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("create")
    private String create(User user) {
        if (userService.register(user)) {
            return "redirect:/index.jsp";
        }
        request.setAttribute("message", "username already existed.");
        return "/signup.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        user = userService.query("user.login", user);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user", user);
            session.setAttribute("users", userService.queryAll());
            return "redirect:/book/queryAll";
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

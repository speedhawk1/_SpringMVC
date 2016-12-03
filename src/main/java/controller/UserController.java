package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/3.
 */
@Controller
@RequestMapping("user") // @WebServlet(urlPatterns = "/user")
public class UserController {

    @RequestMapping("create")
    private String create(User user) {
        System.out.println(user);
//        MyBatis...
        return "/index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        return null;
    }
}

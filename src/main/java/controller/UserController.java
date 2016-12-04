package controller;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import util.MyBatisSession;

/**
 *
 * Created by Administrator on 2016/12/4.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("create")
    private String create(User user) {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            sqlSession.insert("user.create", user);
        }
        return "redirect:/index.jsp";
    }
}

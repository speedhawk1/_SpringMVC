package controller;

import dao.BookDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by Administrator on 2016/12/10.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    @Qualifier("bookDaoImpl")
    private BookDao bookDao;

    @RequestMapping("create")
    private String create(Book book) {
//        sqlSession.insert("book.create", book);
        bookDao.create(book);
        return "redirect:/book/query";
    }

    @RequestMapping("query")
    private String query() {
        session.setAttribute("books", bookDao.query());
        return "redirect:/home.jsp";
    }

    @RequestMapping("search/{id}")
    private String search(@PathVariable int id) {
        session.setAttribute("book", bookDao.search(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        bookDao.modify(book);
        return "redirect:/book/query";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable int id) {
        bookDao.remove(id);
        return "redirect:/book/query";
    }
}

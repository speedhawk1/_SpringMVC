package controller;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BookService;

/**
 *
 * Created by Administrator on 2016/12/10.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("create")
    private String create(Book book) {
        bookService.create(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        session.setAttribute("books", bookService.queryAll());
        return "redirect:/home.jsp";
    }

    @RequestMapping("search/{id}")
    private String search(@PathVariable int id) {
        session.setAttribute("book", bookService.search(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        bookService.modify(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable int id) {
        bookService.remove(id);
        return "redirect:/book/queryAll";
    }
}

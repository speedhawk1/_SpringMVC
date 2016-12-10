package service.impl;

import dao.BookDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import service.BookService;

import java.util.List;

/**
 * Created by Administrator
 * 2016/12/10
 */
@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Autowired
    public BookServiceImpl(@Qualifier("bookDaoImpl") BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void create(Book book) {
        bookDao.create(book);
    }

    @Override
    public List<Book> queryAll() {
        return bookDao.queryAll();
    }

    @Override
    public Book search(int id) {
        return bookDao.search(id);
    }

    @Override
    public void modify(Book book) {
        bookDao.modify(book);
    }

    @Override
    public void remove(int id) {
        bookDao.remove(id);
    }
}

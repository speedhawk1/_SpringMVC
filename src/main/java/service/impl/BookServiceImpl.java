package service.impl;

import dao.GenericDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BookService;

/**
 * Created by Administrator
 * 2016/12/10
 */
@Service
public class BookServiceImpl extends GenericServiceImpl<Book, Integer> implements BookService {

    @Autowired
    public BookServiceImpl(GenericDao<Book, Integer> genericDao) {
        super(genericDao);
    }
}

package dao;

import model.Book;

import java.util.List;

/**
 * Created by Administrator
 * 2016/12/10
 */
public interface BookDao { // StudentDao

    void create(Book book);

    List<Book> queryAll();

    Book search(int id);

    void modify(Book book);

    void remove(int id);
}

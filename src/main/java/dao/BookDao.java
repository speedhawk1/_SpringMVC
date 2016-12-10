package dao;

import model.Book;

import java.util.List;

/**
 * Created by Administrator
 * 2016/12/10
 */
public interface BookDao { // DeviceWriter

    void create(Book book);

    List<Book> query();

    Book search(int id);

    void modify(Book book);

    void remove(int id);
}

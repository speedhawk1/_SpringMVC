package dao.impl;

import dao.BookDao;
import model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator
 * 2016/12/10
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(Book book) {
        sqlSession.insert("book.create", book);
    }

    @Override
    public List<Book> queryAll() {
        return sqlSession.selectList("book.queryAll");
    }

    @Override
    public Book search(int id) {
        return sqlSession.selectOne("book.search", id);
    }

    @Override
    public void modify(Book book) {
        sqlSession.update("book.modify", book);
    }

    @Override
    public void remove(int id) {
        sqlSession.delete("book.remove", id);
    }
}

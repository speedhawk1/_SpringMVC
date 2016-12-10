package dao.impl;

import dao.BookDao;
import model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}

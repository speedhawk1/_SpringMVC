package dao.impl;

import com.mysql.jdbc.Driver;

import dao.BookDao;
import model.Book;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator
 * 2016/12/10
 */
@Repository
public class BookDaoJdbcImpl implements BookDao {
    @Override
    public void create(Book book) {
        System.out.println("BookDaoJdbcImpl...");
        try {
            new Driver();
            Connection connection = DriverManager.getConnection("jdbc:mysql:///test?user=root&password=system");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO test.book VALUES(NULL, ?)");
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Book> queryAll() {
        return null;
    }

    @Override
    public Book search(int id) {
        return null;
    }

    @Override
    public void modify(Book book) {

    }

    @Override
    public void remove(int id) {

    }
}

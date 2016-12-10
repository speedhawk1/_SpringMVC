package dao.impl;

import dao.UserDao;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator
 * 2016/12/10
 */
@Repository
public class UserDaoImpl implements UserDao {

    private final SqlSession sqlSession;

    @Autowired
    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public void create(User user) {
        sqlSession.insert("user.create", user);
    }

    @Override
    public User query(User user) {
        return sqlSession.selectOne("user.login", user);
    }
}

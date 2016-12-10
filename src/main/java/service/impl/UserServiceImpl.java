package service.impl;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by Administrator
 * 2016/12/10
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public User query(String statement, User user) {
        return userDao.query(statement, user);
    }

    @Override
    public boolean register(User user) {
        if (userDao.query("queryUserByUsername", user) != null) {
            return false;
        }
        userDao.create(user);
        return true;
    }
}

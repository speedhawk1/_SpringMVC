package service.impl;

import dao.GenericDao;
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
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

    @Autowired
    public UserServiceImpl(GenericDao<User, Integer> genericDao) {
        super(genericDao);
    }

    @Override
    public boolean register(User user) {
        if (genericDao.query("queryUserByUsername", user) != null) {
            return false;
        }
        genericDao.create(user);
        return true;
    }
}

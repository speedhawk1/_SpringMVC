package dao;

import model.User;

/**
 * Created by Administrator
 * 2016/12/10
 */
public interface UserDao {

    void create(User user);

    User query(User user);
}

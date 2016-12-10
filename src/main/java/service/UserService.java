package service;

import model.User;

/**
 * Created by Administrator
 * 2016/12/10
 */
public interface UserService {

    void create(User user);

    User query(String statement, User user);

    boolean register(User user);
}

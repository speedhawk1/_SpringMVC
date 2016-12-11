package service;

import model.User;

/**
 * Created by Administrator
 * 2016/12/10
 */
public interface UserService extends GenericService<User, Integer> {

    boolean register(User user);
}

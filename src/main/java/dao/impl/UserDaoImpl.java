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
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {
}

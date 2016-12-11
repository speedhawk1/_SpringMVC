package dao;

import java.util.List;

/**
 * Created by Administrator
 * 2016/12/11
 */
public interface GenericDao<T> {
    void create(T t);

    List<T> queryAll();

    T search(int id);

    void modify(T t);

    void remove(int id);
}

package dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator
 * 2016/12/11
 */
public interface GenericDao<T extends Serializable, ID extends Serializable> {
    void create(T t);

    List<T> queryAll();

    T search(ID id);

    void modify(T t);

    void remove(ID id);
}

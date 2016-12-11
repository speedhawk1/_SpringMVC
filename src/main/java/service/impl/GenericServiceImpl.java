package service.impl;

import dao.GenericDao;
import service.GenericService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator
 * 2016/12/11
 */
public class GenericServiceImpl<T extends Serializable, ID extends Serializable> implements GenericService<T, ID> {

    private GenericDao<T, ID> genericDao;

    public GenericServiceImpl(GenericDao<T, ID> genericDao) {
        this.genericDao = genericDao;
    }

    @Override
    public void create(T t) {
        genericDao.create(t);
    }

    @Override
    public List<T> queryAll() {
        return genericDao.queryAll();
    }

    @Override
    public T search(ID id) {
        return genericDao.search(id);
    }

    @Override
    public void modify(T t) {
        genericDao.modify(t);
    }

    @Override
    public void remove(ID id) {
        genericDao.remove(id);
    }
}

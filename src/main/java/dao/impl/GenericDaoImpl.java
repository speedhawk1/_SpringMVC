package dao.impl;

import dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Administrator
 * 2016/12/11
 */
public class GenericDaoImpl<T extends Serializable, ID extends Serializable> implements GenericDao<T, ID> {

    private String namespace; // 对应于 mapper 中 namespace 的值

    @Autowired
    private SqlSession sqlSession;

    @SuppressWarnings("unchecked")
    public GenericDaoImpl() {
//        System.out.println("a: " + getClass());
//        System.out.println("b: " + getClass().getGenericSuperclass());
//        System.out.println("c: " + ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        Class<T> clazz = (Class<T>) ((ParameterizedType) (getClass().getGenericSuperclass())).getActualTypeArguments()[0];
//        System.out.println("d: " + clazz);
//        System.out.println("e: " + clazz.getSimpleName());
        namespace = clazz.getSimpleName().toLowerCase().concat(".");
    }

    @Override
    public void create(T t) {
        sqlSession.insert(namespace.concat("create"), t);
    }

    @Override
    public List<T> queryAll() {
        return sqlSession.selectList(namespace.concat("queryAll"));
    }

    @Override
    public T search(ID id) {
        return sqlSession.selectOne(namespace.concat("search"), id);
    }

    @Override
    public void modify(T t) {
        sqlSession.update(namespace.concat("modify"), t);
    }

    @Override
    public T query(String statement, Object parameter) {
        return sqlSession.selectOne(statement, parameter);
    }

    @Override
    public List<T> queryList(String statement, Object parameter) {
        return sqlSession.selectList(statement, parameter);
    }

    @Override
    public void remove(ID id) {
        sqlSession.delete(namespace.concat("remove"), id);
    }
}

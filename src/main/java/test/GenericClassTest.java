package test;

/**
 * Created by Administrator on 2016/12/11.
 */
public class GenericClassTest<T extends Number> {
    void m1(T t) {

    }

    T m2() {
        return null;
    }
}

interface GenericInterfaceTest<T extends Number, S> {
    void m3(T t, S s);

    T m4(S s);
}

class GenericInterfaceTestImpl<T extends Number, S> implements GenericInterfaceTest<T, S> {

    @Override
    public void m3(T t, S s) {

    }

    @Override
    public T m4(S s) {
        return null;
    }
}


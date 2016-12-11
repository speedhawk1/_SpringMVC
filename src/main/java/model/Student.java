package model;

import java.io.Serializable;

/**
 * Created by Administrator
 * 2016/12/11
 */
public class Student implements Serializable {
    Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

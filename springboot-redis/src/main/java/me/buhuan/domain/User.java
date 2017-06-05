package me.buhuan.domain;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @since 2017/5/23下午4:59
 */
public class User implements Serializable{

    private static final long serialVersionUID = -1L;

    private String id;

    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

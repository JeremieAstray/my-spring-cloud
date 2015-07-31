package com.jeremie.spring.vo;

import java.io.Serializable;

/**
 * @author guanhong 15/7/28 下午10:00.
 */
public class Person implements Serializable{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/10
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + '}';
    }
}
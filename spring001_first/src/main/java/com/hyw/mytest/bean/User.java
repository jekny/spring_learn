package com.hyw.mytest.bean;

/**
 * ClassName: User
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 15:41
 * @Version 1.0
 */
public class User {
    private int id;
    private String name;
    public void study(){
        System.out.println("正在学习");
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }
}

package com.hyw.mytest.bean.service;

/**
 * ClassName: SimpleService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 18:35
 * @Version 1.0
 */
public class SimpleService {
    private int id;
    private  String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "SimpleService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

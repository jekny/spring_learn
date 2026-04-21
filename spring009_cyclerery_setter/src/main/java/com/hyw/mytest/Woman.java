package com.hyw.mytest;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/21 21:41
 * @Version 1.0
 */
public class Woman {
    private String name;

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", man=" + man.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    private Man man;
}

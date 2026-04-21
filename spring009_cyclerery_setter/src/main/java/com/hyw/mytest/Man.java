package com.hyw.mytest;

/**
 * ClassName: Man
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/21 21:42
 * @Version 1.0
 */
public class Man {
    private String name;
    private Woman woman;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", woman=" + woman.getName() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }
}

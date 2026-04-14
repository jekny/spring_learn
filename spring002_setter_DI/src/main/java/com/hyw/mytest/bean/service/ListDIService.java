package com.hyw.mytest.bean.service;

import java.util.List;

/**
 * ClassName: ListDIService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 21:14
 * @Version 1.0
 */
public class ListDIService {
    List<String> lists;

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "ListDIService{" +
                "lists=" + lists +
                '}';
    }
}

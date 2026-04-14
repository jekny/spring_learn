package com.hyw.mytest.bean.service;

import java.util.Arrays;

/**
 * ClassName: ArrayService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 21:19
 * @Version 1.0
 */
public class ArrayService {
    String[] strings;

    @Override
    public String toString() {
        return "ArrayService{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}

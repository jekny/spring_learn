package com.hyw.mytest3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName: Mytest3
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 7:19
 * @Version 1.0
 */
@Component
public class Mytest3 {
    private String name;

    public Mytest3(@Value("张三") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mytest3{" +
                "name='" + name + '\'' +
                '}';
    }
}

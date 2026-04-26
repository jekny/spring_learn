package com.hyw.mytest.impl;

import org.springframework.stereotype.Service;

import javax.crypto.spec.PSource;

/**
 * ClassName: UserImpl2
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/26 21:48
 * @Version 1.0
 */
@Service
public class UserImpl2 {
    public void save(){
        System.out.println("不继承接口，测试程序试试看能不能获取到该bean");
    }
}

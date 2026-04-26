package com.hyw.mytest.impl;

import com.hyw.mytest.UserInterface;

/**
 * ClassName: UserImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/26 20:48
 * @Version 1.0
 */
public class UserImpl implements UserInterface {
    @Override
    public void service() {
        System.out.println("hello User我是业务层");
    }
}

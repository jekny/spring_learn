package com.hyw.mytest.modifyproxy.impl;

import com.hyw.mytest.modifyproxy.UserInterface;

/**
 * ClassName: UserImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 18:51
 * @Version 1.0
 */
public class UserImpl implements UserInterface {
    @Override
    public void createUser() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("UserImpl中的createUser");
    }

    @Override
    public void useUser() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("UserImpl中的useUser");
    }

    @Override
    public void destroyUser() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("UserImpl中的destroyUser");
    }
}

package com.hyw.mytest.service.impl;

import com.hyw.mytest.service.UserInterface;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/27 18:14
 * @Version 1.0
 */
@Service
public class UserImpl implements UserInterface {
    @Override
    public void UserSave() {
        System.out.println("UserSave目标方法执行");
    }
}

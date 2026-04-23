package com.hyw.mytest;

import org.springframework.stereotype.Service;

/**
 * ClassName: UserService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 14:38
 * @Version 1.0
 */
@Service
public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void takeUserDao(){
        userDao.save();
    }
}

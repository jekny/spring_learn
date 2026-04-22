package com.hyw.mytest;

import org.springframework.stereotype.Service;

/**
 * ClassName: UserService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/22 18:56
 * @Version 1.0
 */
@Service
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getDaoService(){
        userDao.save();
    }
}

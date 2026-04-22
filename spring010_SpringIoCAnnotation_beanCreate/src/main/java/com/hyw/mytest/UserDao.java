package com.hyw.mytest;

import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDao
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/22 18:57
 * @Version 1.0
 */
@Repository
public class UserDao {
    public void save(){
        System.out.println("保存用户成功");
    }
}

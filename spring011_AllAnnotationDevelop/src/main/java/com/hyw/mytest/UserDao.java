package com.hyw.mytest;

import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDao
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 14:38
 * @Version 1.0
 */
@Repository
public class UserDao {
    public void save(){
        System.out.println("保存数据库成功");
    }
}

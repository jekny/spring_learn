package com.hyw.mytest4;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * ClassName: MyDao1
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 12:15
 * @Version 1.0
 */
@Repository
public class MyDao1 {

    public void save(){
        System.out.println("Dao保存成功");
    }
}

package com.hyw.mytest4;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * ClassName: MyService1
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 12:16
 * @Version 1.0
 */
@Service
public class MyService1 {

    private MyDao1 myDao1;


    @Resource//通过方法上面注解
    public void setMyDao1(MyDao1 myDao1) {
        this.myDao1 = myDao1;
    }

    public void getDaoSave(){
        myDao1.save();
    }
}

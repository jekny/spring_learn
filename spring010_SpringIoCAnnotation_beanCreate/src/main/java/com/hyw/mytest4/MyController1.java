package com.hyw.mytest4;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * ClassName: MyController1
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 12:15
 * @Version 1.0
 */
@Controller
public class MyController1 {
    @Resource//通过属性上面注解
    private MyService1 myService1;

    public void getService(){
        myService1.getDaoSave();
    }
}

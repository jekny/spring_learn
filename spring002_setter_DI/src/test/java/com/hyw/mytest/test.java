package com.hyw.mytest;

import com.hyw.mytest.bean.service.ConstructService;
import com.hyw.mytest.bean.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: test
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 15:52
 * @Version 1.0
 */
public class test {
    @Test
    public void test01(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = beanFactory.getBean("UserService1", UserService.class);
        userService1.save();

        ConstructService constructService1 = beanFactory.getBean("ConstructService1", ConstructService.class);
        constructService1.save();
    }
}

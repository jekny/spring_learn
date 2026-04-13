package com.hyw;

import com.hyw.mytest.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: test
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 15:48
 * @Version 1.0
 */
public class test {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user1 = (User) applicationContext.getBean("User01");
        System.out.println(user1);
        user1.study();
    }
}

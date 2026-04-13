package com.hyw;

import com.hyw.mytest.bean.Car;
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
        //获取spring上下文对象（启动Spring的IoC容器）
        //当这行代码执行的时候会自动解析beans.xml文件，同时初始化配置文件中所有的bean，并放到Map集合当中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml","applicationContext.xml");

        //从Spring的IoC容器中通过id获取bean对象
        User user1 = (User) applicationContext.getBean("User01");
        System.out.println(user1);
        user1.study();

//        Car carBean = (Car) applicationContext.getBean("CarBean");
        Car carBean = applicationContext.getBean("CarBean", Car.class);
        System.out.println(carBean);
    }
}

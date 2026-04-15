package com.hyw.mytest;

import com.hyw.mytest.bean.service.*;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static Logger logger = LoggerFactory.getLogger(test.class);
    @Test
    public void test01(){

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = beanFactory.getBean("UserService1", UserService.class);
        userService1.save();
        System.out.println(beanFactory.getBean("UserService1", UserService.class));
        System.out.println(beanFactory.getBean("UserService1", UserService.class));
        System.out.println(beanFactory.getBean("UserService1", UserService.class));
        System.out.println(beanFactory.getBean("UserService1", UserService.class));
        System.out.println(beanFactory.getBean("UserService1", UserService.class));
        System.out.println(beanFactory.getBean("UserService1", UserService.class));

        ConstructService constructService1 = beanFactory.getBean("ConstructService1", ConstructService.class);
        constructService1.save();

        SimpleService simpleService1 = beanFactory.getBean("SimpleService1", SimpleService.class);
        System.out.println(simpleService1.toString());

        ListDIService listDIService = beanFactory.getBean("ListDIService", ListDIService.class);
        System.out.println(listDIService.toString());

        ArrayService arrayService = beanFactory.getBean("ArrayService", ArrayService.class);
        System.out.println(arrayService.toString());

        SetService setService = beanFactory.getBean("SetService", SetService.class);
        System.out.println(setService.toString());

        MapService mapService = beanFactory.getBean("MapService", MapService.class);
        System.out.println(mapService.toString());

        PropertiesService propertiesService = beanFactory.getBean("PropertiesService", PropertiesService.class);
        System.out.println(propertiesService.toString());

        logger.info("my info:");

        BeanFactory beanFactory1 = new ClassPathXmlApplicationContext("propertiesout.xml");
        PropertiesOutService propertiesOutService = beanFactory1.getBean("PropertiesOutService", PropertiesOutService.class);
        System.out.println(propertiesOutService.toString());
    }
}

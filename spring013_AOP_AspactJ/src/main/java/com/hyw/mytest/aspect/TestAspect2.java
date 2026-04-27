package com.hyw.mytest.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ClassName: TestAspect2
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/27 10:41
 * @Version 1.0
 */
@Aspect
@Component
public class TestAspect2 {

    @After("execution(* com.hyw.mytest..*(..))")
    public void getAfter(){
        System.out.println("我是后置通知");
    }
}

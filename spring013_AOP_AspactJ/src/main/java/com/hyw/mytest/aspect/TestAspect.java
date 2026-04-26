package com.hyw.mytest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * ClassName: TestAspect
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/26 21:13
 * @Version 1.0
 */
@Aspect
@Component
public class TestAspect {

    @Before("execution(* com.hyw.mytest.impl..*(..) )" )
    public void beforeAspect(){
        System.out.println("i am before aspect通知");
    }
}

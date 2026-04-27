package com.hyw.mytest.myaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyAspect
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/27 18:19
 * @Version 1.0
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.hyw.mytest..*(..) )")
    public void myPointcut(){}

    @Around("myPointcut()")
    public Object MyAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知kaishi执行(模拟开启事务)");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知jieshu执行(模拟开启事务)");
        return proceed;
    }
}

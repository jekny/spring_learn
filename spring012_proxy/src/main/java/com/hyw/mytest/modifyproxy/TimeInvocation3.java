package com.hyw.mytest.modifyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: TimeInvocation3
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/25 15:50
 * @Version 1.0
 */
public class TimeInvocation3 implements InvocationHandler {
    private Object object;

    public TimeInvocation3(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object o = method.invoke(object, args);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        return o;
    }
}

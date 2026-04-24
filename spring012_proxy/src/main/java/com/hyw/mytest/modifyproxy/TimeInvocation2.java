package com.hyw.mytest.modifyproxy;

import com.hyw.mytest.modifyproxy.impl.UserImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: TimeInvocation2
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/24 9:23
 * @Version 1.0
 */
public class TimeInvocation2 implements InvocationHandler {
    private Object user;

    public TimeInvocation2(Object user) {
        this.user = user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();
        Object o = method.invoke(user, args);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        return o;
    }
}

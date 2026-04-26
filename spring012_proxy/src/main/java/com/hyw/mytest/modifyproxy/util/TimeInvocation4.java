package com.hyw.mytest.modifyproxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: TimeInvocation4
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/26 12:19
 * @Version 1.0
 */
public class TimeInvocation4 {
    public static Object getProxy(Object target){
        Object o1 = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args)-> {
                    long start = System.currentTimeMillis();
                    Object o = method.invoke(target, args);
                    long end = System.currentTimeMillis();
                    System.out.println(end-start);
                    return o;
                });
        return o1;
    }
}

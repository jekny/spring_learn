package com.hyw.mytest.modifyproxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: InvocationUtil
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/25 15:59
 * @Version 1.0
 */
public class InvocationUtil {
    public static Object getTimeInvocation(Object target){
        Proxy o1 = (Proxy) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
            long start = System.currentTimeMillis();
            Object o = method.invoke(target, args);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            return o;
        });
        return o1;
    }



}

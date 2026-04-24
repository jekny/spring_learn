package com.hyw.mytest.modifyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: TimeInvocation
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/24 8:32
 * @Version 1.0
 */
public class TimeInvocation implements InvocationHandler {
    private Object target;

    public TimeInvocation(Object target) {
        this.target = target;
    }

    //当代理对象调用代理方法时，invoke方法会被自动调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();

        //核心代码
        Object o = method.invoke(target, args);

        long end = System.currentTimeMillis();
        System.out.println("花费:"+(end-start));

        return o;
    }
}

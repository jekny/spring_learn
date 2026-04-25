package com.hyw.proxy.modifyproxy;

import com.hyw.mytest.modifyproxy.TimeInvocation;
import com.hyw.mytest.modifyproxy.TimeInvocation2;
import com.hyw.mytest.modifyproxy.TimeInvocation3;
import com.hyw.mytest.modifyproxy.UserInterface;
import com.hyw.mytest.modifyproxy.impl.UserImpl;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * ClassName: MyText
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 15:37
 * @Version 1.0
 */
public class MyText {
    @Test
    public void test(){
        UserInterface target = new UserImpl();
        UserInterface userproxy = (UserInterface)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimeInvocation2(target));
        userproxy.createUser();
        userproxy.useUser();
        userproxy.destroyUser();
    }

    @Test
    public void test02(){
        UserInterface user = new UserImpl();
        UserInterface o = (UserInterface) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), new TimeInvocation3(user));
        o.createUser();
        o.useUser();
        o.destroyUser();

    }
}

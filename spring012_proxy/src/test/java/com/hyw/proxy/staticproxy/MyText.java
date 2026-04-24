package com.hyw.proxy.staticproxy;

import com.hyw.mytest.staticproxy.OrderImpl;
import com.hyw.mytest.staticproxy.OrderProxy;
import com.hyw.mytest.staticproxy.OrderProxy2;
import org.junit.jupiter.api.Test;

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
    public void test() throws InterruptedException {
        OrderProxy2 orderProxy = new OrderProxy2(new OrderImpl());//这里就相当于目标类找了一个代理类
        orderProxy.create();
        orderProxy.use();
        orderProxy.destroy();
    }
}

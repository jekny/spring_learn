package com.hyw.mytest.staticproxy;

/**
 * ClassName: OrderImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 15:30
 * @Version 1.0
 */
public class OrderImpl implements OrderInterface{
    @Override
    public void create() throws InterruptedException {
        Thread.sleep(1234);
        System.out.println("实现类：订单创建create");
    }

    @Override
    public void use() throws InterruptedException {
        Thread.sleep(1234);
        System.out.println("实现类：订单使用use");
    }

    @Override
    public void destroy() throws InterruptedException {
        Thread.sleep(1234);
        System.out.println("实现类：订单销毁destroy");
    }
}

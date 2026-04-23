package com.hyw.mytest.staticproxy;

/**
 * ClassName: OrderProxy
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 15:32
 * @Version 1.0
 */
public class OrderProxy implements OrderInterface{
    private OrderInterface targit;

    public OrderProxy(OrderInterface targit) {
        this.targit = targit;
    }

    @Override
    public void create() throws InterruptedException {
        long start = System.currentTimeMillis();
        targit.create();
        long end = System.currentTimeMillis();
        System.out.println("代理类的输出：create花时："+(end-start));
    }

    @Override
    public void use() throws InterruptedException {
        long start = System.currentTimeMillis();
        targit.use();
        long end = System.currentTimeMillis();
        System.out.println("代理类的输出：use花时："+(end-start));
    }

    @Override
    public void destroy() throws InterruptedException {
        long start = System.currentTimeMillis();
        targit.destroy();
        long end = System.currentTimeMillis();
        System.out.println("代理类的输出：destroy花时："+(end-start));
    }
}

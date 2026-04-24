package com.hyw.mytest.staticproxy;

/**
 * ClassName: OrderProxy2
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/24 9:09
 * @Version 1.0
 */
public class OrderProxy2 implements OrderInterface{
    private OrderImpl target;

    public OrderProxy2(OrderImpl target) {
        this.target = target;
    }

    @Override
    public void create() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("代理类");
        target.create();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Override
    public void use() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("代理类");
        target.use();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Override
    public void destroy() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("代理类");
        target.destroy();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}

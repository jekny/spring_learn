package com.hyw.mytest.staticproxy;

/**
 * ClassName: OrderInterface
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 15:28
 * @Version 1.0
 */
public interface OrderInterface {
    void create() throws InterruptedException;
    void use() throws InterruptedException;
    void destroy() throws InterruptedException;
}

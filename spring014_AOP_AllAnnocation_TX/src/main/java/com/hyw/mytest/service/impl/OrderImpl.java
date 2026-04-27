package com.hyw.mytest.service.impl;

import com.hyw.mytest.service.OrderInterface;
import org.springframework.stereotype.Service;

/**
 * ClassName: OrderImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/27 18:15
 * @Version 1.0
 */
@Service
public class OrderImpl implements OrderInterface {
    @Override
    public void OrderSave() {
        System.out.println("OrderSave目标方法执行");
    }
}

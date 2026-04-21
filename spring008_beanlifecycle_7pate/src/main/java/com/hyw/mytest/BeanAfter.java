package com.hyw.mytest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName: BeanAfter
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/21 7:59
 * @Version 1.0
 */
public class BeanAfter implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后处理器的Before");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后处理器的After");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

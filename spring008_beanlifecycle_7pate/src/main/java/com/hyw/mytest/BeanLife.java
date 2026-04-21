package com.hyw.mytest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.support.DefaultLifecycleProcessor;

/**
 * ClassName: BeanLife
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/20 16:26
 * @Version 1.0
 */
public class BeanLife implements BeanFactoryAware {

    private String name;

    public BeanLife() {
        System.out.println("1.构造方法实例化bean");
    }

    public void setName(String name) {
        System.out.println("2.bean赋值");
        this.name = name;
    }

    public void init(){
        System.out.println("3.初始化bean");
    }

    public void distroy(){
        System.out.println("5.销毁bean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}

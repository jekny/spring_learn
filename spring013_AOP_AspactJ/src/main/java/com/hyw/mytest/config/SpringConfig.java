package com.hyw.mytest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName: SpringConfig
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/26 20:53
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.hyw.mytest"})
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启自动代理(凡是带有@Aspect注解的bean都会自动生成代理对象),true是使用CGlib，默认JDK代理机制
public class SpringConfig {

}

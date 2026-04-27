package com.hyw.mytest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName: SpringConfig
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/27 18:17
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.hyw.mytest"})
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启CGLIB自动代理
public class SpringConfig {
}

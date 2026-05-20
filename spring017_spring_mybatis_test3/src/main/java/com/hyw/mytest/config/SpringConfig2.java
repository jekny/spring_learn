package com.hyw.mytest.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ClassName: SpringConfig2
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/19 21:31
 * @Version 1.0
 */
@Configuration
@ComponentScan(value = {"com.hyw.mytest"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(value = {"com.hyw.matest.mapper"})
@PropertySource("classpath:database.properties")
public class SpringConfig2 {
    @Bean//配置数据源
    DataSource getResourse(
            @Value("${mybatis.data.driver}")
            String driver,
            @Value("${mybatis.data.url}")
            String url,
            @Value("${mybatis.data.user}")
            String user,
            @Value("${mybatis.data.password}")
            String password
    ){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName(driver);
        hikariDataSource.setJdbcUrl(url);
        hikariDataSource.setUsername(user);
        hikariDataSource.setPassword(password);
        return hikariDataSource;
    }
}

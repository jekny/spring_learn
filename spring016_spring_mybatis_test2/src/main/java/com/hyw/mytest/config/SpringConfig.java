package com.hyw.mytest.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ClassName: SpringConfig
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/14 11:37
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.hyw.mytest")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@PropertySource("classpath:application.properties")//引入外部属性配置文件
@MapperScan(value = {"com.hyw.mytest.mapper"})
@EnableTransactionManagement(proxyTargetClass = true)//开启事务注解，让方法上的Transactional注解可用
public class SpringConfig {
    @Bean
    public DataSource dataSource(
            @Value("${mybatis.data.driver}")
            String driverclass,
            @Value("${mybatis.data.url}")
            String url,
            @Value("${mybatis.data.user}")
            String user,
            @Value("${mybatis.data.password}")
            String password
    ){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(driverclass);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    //SqlSessionFactoryBean方式一（注入mybatis核心配置文件路径，指定别名包，注入数据源）
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        Resource resource = new ClassPathResource("mybatisConfig.xml");
//        sqlSessionFactoryBean.setConfigLocation(resource);
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.hyw.mytest.entity");
//        return sqlSessionFactoryBean;
//    }

    //SqlSessionFactoryBean方式二
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean2(
            DataSource dataSource,
            @Value("${mybatis.data.mybatisconfig}")
            String mybatisconfig,
            @Value("${mybatis.data.myaliases}")
            String myaliases
            ){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        Resource resource = new ClassPathResource(mybatisconfig);
        sqlSessionFactoryBean.setConfigLocation(resource);
        sqlSessionFactoryBean.setTypeAliasesPackage(myaliases);
        return sqlSessionFactoryBean;
    }

    //代替事务管理器的配置
    @Bean//配置事务管理器（只有这里的配置是不行的，需要在配置文件的头上加上 开启事务的注解，两个联合起来才能让 @Transactional注解可用，@Transactional底层就是用切面来切入你想要加入事务的那个方法）
    //保证一次数据库连接中只有一个SqlSession对象
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }


}

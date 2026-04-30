package com.hyw.mytest.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.javassist.ClassPath;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ClassName: SpringMybatisConfig
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/30 15:39
 * @Version 1.0
 */
@Configuration
@ComponentScan(value = {"com.hyw.mytest"})
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启CGLIB自动动态代理
@PropertySource("classpath:jdbc.properties")//引入外部属性配置文件
@MapperScan(value = {"com.hyw.mytest.mapper"})
@EnableTransactionManagement//写这个就能在实现类中的方法或类中写@Transactional注解就会自动开启事务，（底层也是切入切面）
public class SpringMybatisConfig {

    @Bean
    public DataSource dataSource(
            @Value("${mybatis.data.source.driver}")
            String derver,
            @Value("${mybatis.data.source.url}")
            String url,
            @Value("${mybatis.data.source.user}")
            String user,
            @Value("${mybatis.data.source.password}")
            String password
    ){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(derver);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    //这里的dataSource参数在Spring IoC容器中会自动注入，因为我们在上面的方法中将DataSource注入到容器中了，所以这里的参数它能在IoC容纳中找到
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(
            @Value("${mybatis.data.source.mybatisconfig}")
            String mybatisconfig,
            DataSource dataSource,
            @Value("${mybatis.data.source.aliases}")
            String aliases
            ){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        Resource resource = new ClassPathResource(mybatisconfig);
        sqlSessionFactoryBean.setConfigLocation(resource);
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(aliases);
        return sqlSessionFactoryBean;
    }

    //事务管理器
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}

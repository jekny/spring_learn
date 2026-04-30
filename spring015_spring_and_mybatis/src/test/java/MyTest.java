import com.hyw.mytest.config.SpringMybatisConfig;
import com.hyw.mytest.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/30 17:29
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringMybatisConfig.class);
        AccountServiceImpl accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountServiceImpl.transfer("act-001","act-002",new BigDecimal(10000));

    }
}

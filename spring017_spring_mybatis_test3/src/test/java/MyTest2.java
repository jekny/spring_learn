import com.hyw.mytest.config.SpringConfig2;
import com.hyw.mytest.service.impl.AccountServiceImpl2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

/**
 * ClassName: MyTest2
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/20 8:38
 * @Version 1.0
 */
public class MyTest2 {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig2.class);
        AccountServiceImpl2 accountServiceImpl2 = applicationContext.getBean("accountServiceImpl2",AccountServiceImpl2.class);
        accountServiceImpl2.transformal("act-001","act-002",new BigDecimal(10000));
    }
}

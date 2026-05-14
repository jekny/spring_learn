import com.hyw.mytest.config.SpringConfig;
import com.hyw.mytest.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

/**
 * ClassName: mytest
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/14 15:11
 * @Version 1.0
 */
public class mytest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountServiceImpl bean = applicationContext.getBean(AccountServiceImpl.class);
        bean.transfore("act-001","act-002",new BigDecimal(10000));
    }
}

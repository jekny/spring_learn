import com.hyw.mytest.UserInterface;
import com.hyw.mytest.config.SpringConfig;
import com.hyw.mytest.impl.UserImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/26 21:23
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserInterface userImpl = applicationContext.getBean("userImpl", UserInterface.class);
        userImpl.service();
    }
}

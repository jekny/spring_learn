import com.hyw.mytest.UserDao;
import com.hyw.mytest.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 14:43
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userDao);
        System.out.println(userService);
        userService.takeUserDao();
    }
}

import com.hyw.mytest.UserController;
import com.hyw.mytest.UserDao;
import com.hyw.mytest.UserService;
import com.hyw.mytest2.MyController;
import com.hyw.mytest3.Mytest3;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/22 18:51
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userController);
        System.out.println(userService);
        System.out.println(userDao);

        MyController myController = applicationContext.getBean("myController", MyController.class);
        System.out.println(myController);
    }

    @Test
    public void test03(){
        ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
        Mytest3 mytest3 = a.getBean("mytest3", Mytest3.class);
        System.out.println(mytest3);
    }
}

import com.hyw.mytest.Man;
import com.hyw.mytest.Woman;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/21 21:47
 * @Version 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = applicationContext.getBean("man", Man.class);

        Woman woman = applicationContext.getBean("woman", Woman.class);

        System.out.println(man);
        System.out.println(woman);
    }
}

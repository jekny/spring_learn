import com.hyw.mytest.BeanLife;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/20 16:32
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext Factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanLife beanLife = Factory.getBean("BeanLife", BeanLife.class);
        System.out.println("4.使用bean"+beanLife);
        Factory.close();
    }
}

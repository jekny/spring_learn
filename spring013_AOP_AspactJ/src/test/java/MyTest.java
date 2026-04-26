import com.hyw.mytest.UserInterface;
import com.hyw.mytest.config.SpringConfig;
import com.hyw.mytest.impl.UserImpl;
import com.hyw.mytest.impl.UserImpl2;
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
    //如果目标类实现了至少一个接口，Spring 将使用 JDK 动态代理。
    //生成的代理对象属于 java.lang.reflect.Proxy 的子类，它实现了目标类所实现的接口，但不是目标类的子类。因此，该 Bean 只能被转换为它实现的接口类型（例如 UserInterface），强制转换为实现类（如 UserImpl）会抛出 ClassCastException。
    //
    //如果目标类没有实现任何接口，Spring 将使用 CGLIB 代理。
    //生成的代理对象是目标类的子类。因此，该 Bean 可以被转换为目标类本身（例如 UserImpl2），因为它本身就是目标类的子类实例。
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserImpl userImpl = applicationContext.getBean("userImpl", UserImpl.class);
        userImpl.service();
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserImpl2 userImpl2 = applicationContext.getBean("userImpl2", UserImpl2.class);
        //如果省略userImpl2名称的话，就会根据类型获取bean
        userImpl2.save();
    }
}

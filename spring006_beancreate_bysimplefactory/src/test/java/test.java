import com.hyw.mytest.Qiang;
import com.hyw.mytest.QiangFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: test
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/18 11:23
 * @Version 1.0
 */
public class test {
    @Test
    public void test01(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Qiang createqiang = beanFactory.getBean("createqiang", Qiang.class);
        System.out.println(createqiang);
    }
}

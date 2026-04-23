import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SpringConfiguration
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/23 14:41
 * @Version 1.0
 */
//全注解式开发的配置类（类的名称是规定的，就叫SpringConfiguration，）
@Configuration
@ComponentScan(value = {"com.hyw.mytest"})
public class SpringConfiguration {
}

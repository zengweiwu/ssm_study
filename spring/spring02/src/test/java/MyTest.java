import com.zww.zengw.service.UserService;
import com.zww.zengw.service.serviceimpl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象 这里代理的是接口 所以要指定返回接口
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }
}

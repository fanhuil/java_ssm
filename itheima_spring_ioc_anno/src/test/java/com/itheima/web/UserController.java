package com.itheima.web;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author fanhuilin
 * @date 2021-10-12 10:35
 */

public class UserController {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}


/**
 * Spring原始注解
 * @Component
 * @Controller
 * @Service
 * @Repository
 * @Autowired
 * @Qualifier
 * @Resource
 * @Scope
 * @Value
 * @PostConstruct
 * @PreDestroy
 *
 * Spring新注解
 * @Configuration 用于指定当前类是一个Spring配置类，当创建容器时会从该类上加载注解
 * @ComponentScan 用于指定Spring在初始化容器时要扫描的包。
 *                作用和在Spring的xml配置文件中的
 *                <context:component-scan base-package="com.itheima"/>一样
 * @Bean 使用在方法上，标注将改方法的返回值存储到spring容器中
 * @PropertySource() 用于加载.properties文件中的配置
 * @Import 用于导入其他配置类
 */
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
 * @Component 使用在类上用于实例化Bean
 * @Controller 使用在web层类上用于实例化Bean
 * @Service 使用在service层类上用于实例化Bean
 * @Repository 使用在dao层类上用于实例化Bean
 * @Autowired 使用在字段上用于根据类型依赖注入
 * @Qualifier 结合@Autowired一起使用用于根据名称进行依赖注入
 * @Resource 相当于@Autowired+@Qualifier，按照名称进行注入
 * @Value 注入普通属性
 * @Scope 注入Bean的作用范围
 * @PostConstruct 使用在方法上标注该方法是Bean的初始化方法
 * @PreDestroy 使用在方法上标注该方法是Bean的销毁方法
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
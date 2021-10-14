package coom.itheima.demo;

import coom.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author fanhuilin
 * @date 2021-10-11 16:07
 */
public class UserController {
    public static void main(String[] args) {
        /*ApplicationContext的实现类
        * 从类的根李静
        * FileSystemXmlApplicationContext
        * 从磁盘
        * AnnotationConfigApplicationContext
        * 当使用注解配置容器对象时，需要使用此类来创建spring容器。它用来读取注解。
        * */
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}

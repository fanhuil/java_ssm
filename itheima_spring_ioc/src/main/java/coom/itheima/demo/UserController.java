package coom.itheima.demo;

import coom.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanhuilin
 * @date 2021-10-11 16:07
 */
public class UserController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userDao = (UserService) app.getBean("userDao");
        userDao.save();
    }
}

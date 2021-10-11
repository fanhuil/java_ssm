package coom.itheima.demo;

import coom.itheima.dao.impl.UserDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanhuilin
 * @date 2021-10-11 15:16
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao = (UserDaoImpl) app.getBean("userDao");
        userDao.save();
    }
}

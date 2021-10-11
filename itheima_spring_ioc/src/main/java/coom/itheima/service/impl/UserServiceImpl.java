package coom.itheima.service.impl;

import coom.itheima.dao.UserDao;
import coom.itheima.dao.impl.UserDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanhuilin
 * @date 2021-10-11 16:04
 */
public class UserServiceImpl implements UserDao {

    @Override
    public void save() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao = (UserDaoImpl) app.getBean("userDao");
        userDao.save();
    }
}

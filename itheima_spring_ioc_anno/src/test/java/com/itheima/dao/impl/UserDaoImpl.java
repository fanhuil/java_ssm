package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author fanhuilin
 * @date 2021-10-12 9:21
 */

// <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"></bean>
// @Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running...");
    }
}

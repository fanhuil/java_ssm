package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.swing.*;

/**
 * @author fanhuilin
 * @date 2021-10-12 9:23
 */
// <bean id="userService" class="com.itheima.service.impl.UserServiceImpl"></bean>
// @Component("userService")
@Service("userService")
// @Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}") // 普通属性注入
    private String driver;

    // <property name="userDao" ref="userDao"></property> 使用注解方式set方法可以不写
    //@Autowired // 按照数据类型从Spring容器中进行匹配
    //@Qualifier("userDao") // 是按照id值从容器中进行匹配的，但是此处和@Autowired一起使用
    @Resource(name = "userDao") // 相当于@Autowired+@Qualifier
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println(this.driver);
        this.userDao.save();
    }

    @PostConstruct
    public void init() {
        System.out.println("容器创建了...");
    }

    @PreDestroy
    public void destory() {
        System.out.println("容器销毁了...");
    }
}

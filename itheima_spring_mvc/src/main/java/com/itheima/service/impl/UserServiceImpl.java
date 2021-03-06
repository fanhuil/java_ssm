package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

/**
 * spring集成web环境
 * @author fanhuilin
 * @date 2021-10-12 14:09
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}

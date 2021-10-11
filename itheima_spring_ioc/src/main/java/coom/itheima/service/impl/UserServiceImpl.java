package coom.itheima.service.impl;

import coom.itheima.dao.UserDao;
import coom.itheima.service.UserService;

/**
 * @author fanhuilin
 * @date 2021-10-11 16:04
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

//    public UserServiceImpl() {
//    }

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

        public void setUserDao(UserDao userDao) {
            this.userDao = userDao;
        }

    @Override
    public void save() {
        userDao.save();
    }
}

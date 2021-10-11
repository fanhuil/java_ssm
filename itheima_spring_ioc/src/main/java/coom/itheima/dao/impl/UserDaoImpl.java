package coom.itheima.dao.impl;

import coom.itheima.dao.UserDao;

/**
 * @author fanhuilin
 * @date 2021-10-11 13:14
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destory(){
        System.out.println("销毁方法...");
    }

    public void save() {
        System.out.println("saving running...");
    }
}

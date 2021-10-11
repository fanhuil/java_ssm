package coom.itheima.dao.impl;

import coom.itheima.dao.UserDao;
import coom.itheima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author fanhuilin
 * @date 2021-10-11 13:14
 */
public class UserDaoImpl implements UserDao {


    private String name;
    private int age;
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;
//    public UserDaoImpl() {
//        System.out.println("UserDaoImpl创建...");
//    }
//
//    public void init(){
//        System.out.println("初始化方法...");
//    }
//
//    public void destory(){
//        System.out.println("销毁方法...");
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save() {
        System.out.println(this.name + "====" + this.age);
        System.out.println("saving running...");
    }
}

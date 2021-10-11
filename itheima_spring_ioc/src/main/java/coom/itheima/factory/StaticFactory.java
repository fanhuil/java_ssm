package coom.itheima.factory;

import coom.itheima.dao.UserDao;
import coom.itheima.dao.impl.UserDaoImpl;

/**
 * @author fanhuilin
 * @date 2021-10-11 15:49
 */
public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

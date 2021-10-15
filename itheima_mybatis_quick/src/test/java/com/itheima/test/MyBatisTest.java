package com.itheima.test;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author fanhuilin
 * @date 2021-10-15 14:39
 */
public class MyBatisTest {
    @Test
    // 删除
    public void test4() throws IOException {
        // 获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行操作 参数namespace+id
        int count = sqlSession.delete("userMapper.delete", 6);

        //mybatis执行更新操作，提交事务
        sqlSession.commit();
        // 打印数据
        System.out.println(count);
        // 释放资源
        sqlSession.close();
    }

    @Test
    // 修改
    public void test3() throws IOException {

        // 模拟user对象
        User user = new User();
        user.setId(6);
        user.setName("lucy");
        user.setPassword("123");

        // 获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行操作 参数namespace+id
        int count = sqlSession.update("userMapper.update", user);

        //mybatis执行更新操作，提交事务
        sqlSession.commit();
        // 打印数据
        System.out.println(count);
        // 释放资源
        sqlSession.close();
    }

    @Test
    // 添加
    public void test2() throws IOException {

        // 模拟user对象
        User user = new User();
        user.setName("tom1");
        user.setPassword("abc");


        // 获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行操作 参数namespace+id
        int count = sqlSession.insert("userMapper.save", user);

        //mybatis执行更新操作，提交事务
        sqlSession.commit();
        // 打印数据
        System.out.println(count);
        // 释放资源
        sqlSession.close();
    }

    @Test
    // 查询
    public void test1() throws IOException {
        // 获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行操作 参数namespace+id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        // 打印数据
        System.out.println(userList);
        // 释放资源
        sqlSession.close();
    }
}

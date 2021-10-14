package com.itheima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @author fanhuilin
 * @date 2021-10-14 16:42
 */
public class JdbcTemplateTest {

    @Test
    public void test1() throws PropertyVetoException {
        // 创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/www_backstage_com");
        dataSource.setUser("www_backstage_com");
        dataSource.setPassword("www_backstage_com");


        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        String sql = "insert into account(name,acount) values(?,?)";
        int num = jdbcTemplate.update(sql, "tom", 5000);
        System.out.println(num);
    }
}

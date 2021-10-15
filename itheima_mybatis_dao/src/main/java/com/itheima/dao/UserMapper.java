package com.itheima.dao;

import com.itheima.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author fanhuilin
 * @date 2021-10-15 15:39
 */
public interface UserMapper {
    public List<User> findAll() throws IOException;
    public User findById(int id);
}

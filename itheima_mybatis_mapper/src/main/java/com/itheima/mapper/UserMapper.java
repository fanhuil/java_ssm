package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author fanhuilin
 * @date 2021-10-15 16:10
 */
public interface UserMapper {
    public List<User> findByCondition(User user);
}

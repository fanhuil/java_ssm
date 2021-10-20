package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author fanhuilin
 * @date 2021-10-20 15:11
 */
public interface AccountMapper {
    // 保存账户数据
    void save(Account account);

    // 查询账户数据
    List<Account> findAll();
}

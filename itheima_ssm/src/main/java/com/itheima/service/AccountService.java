package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author fanhuilin
 * @date 2021-10-20 15:12
 */
public interface AccountService {
    public void save(Account account);

    public List<Account> findAll();
}

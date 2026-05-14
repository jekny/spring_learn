package com.hyw.mytest.mapper;

import com.hyw.mytest.entity.Account;

/**
 * ClassName: AccountMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/14 9:57
 * @Version 1.0
 */
public interface AccountMapper {
    Account selectAccount(String actNo);
    int updataAccount(Account account);
}

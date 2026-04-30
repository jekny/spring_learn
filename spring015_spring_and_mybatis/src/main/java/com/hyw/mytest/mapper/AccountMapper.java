package com.hyw.mytest.mapper;

import com.hyw.mytest.entity.Account;

/**
 * ClassName: AccountMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/30 7:48
 * @Version 1.0
 */
public interface AccountMapper {
    Account selectByActNo(String actNo);

    int updateBalanceByActNo(Account account);

}

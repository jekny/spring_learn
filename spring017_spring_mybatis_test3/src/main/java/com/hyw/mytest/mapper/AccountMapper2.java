package com.hyw.mytest.mapper;

import com.hyw.mytest.entity.AccountEnd;

/**
 * ClassName: AccountMapper2
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/19 17:40
 * @Version 1.0
 */
public interface AccountMapper2 {
    AccountEnd selectAct(String actNo);
    int updateAct(AccountEnd actNo);
}

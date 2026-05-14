package com.hyw.mytest.service;

import com.hyw.mytest.entity.Account;

import java.math.BigDecimal;

/**
 * ClassName: AccountService
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/14 10:05
 * @Version 1.0
 */
public interface AccountService {
    void transfore(String act1, String act2, BigDecimal balance);
}

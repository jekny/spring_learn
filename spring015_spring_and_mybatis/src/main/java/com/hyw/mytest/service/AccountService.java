package com.hyw.mytest.service;

import java.math.BigDecimal;

/**
 * ClassName: AccountService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/30 7:50
 * @Version 1.0
 *
 */
public interface AccountService {
    void transfer(String fromActNo, String toActNo, BigDecimal amount);
}

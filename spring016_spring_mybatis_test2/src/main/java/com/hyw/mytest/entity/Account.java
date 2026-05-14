package com.hyw.mytest.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: Account
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/14 9:31
 * @Version 1.0
 */
@Data//自动生成get、set方法
public class Account {
    private Long id;
    private String actNo;
    private BigDecimal balance;
}

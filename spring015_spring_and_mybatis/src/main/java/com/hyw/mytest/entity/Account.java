package com.hyw.mytest.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: Account
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/30 7:44
 * @Version 1.0
 */
//@Data 自动写get、set和toString方法
@Data
public class Account {
    private Long id;
    private String actNo;
    private BigDecimal balance;
}

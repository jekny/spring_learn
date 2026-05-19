package com.hyw.mytest.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * ClassName: AccountEnd
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/19 17:18
 * @Version 1.0
 */
@Data
public class AccountEnd {
    private int id;
    private String actNo;
    private BigDecimal balance;
}

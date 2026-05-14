package com.hyw.mytest.service.impl;

import com.hyw.mytest.entity.Account;
import com.hyw.mytest.mapper.AccountMapper;
import com.hyw.mytest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * ClassName: AccountServiceImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/14 10:06
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public void transfore(String fromAct, String toAct, BigDecimal balance) {
        Account account1= accountMapper.selectAccount(fromAct);
        if (account1.getBalance().compareTo(balance)<0){
            throw new RuntimeException("余额不足");
        }
        Account account2 = accountMapper.selectAccount(toAct);
        account1.setBalance(account1.getBalance().subtract(balance));
        account2.setBalance(account2.getBalance().add(balance));

        int i =accountMapper.updataAccount(account1);
        i+= accountMapper.updataAccount(account2);
        if (i!=2){
            throw new RuntimeException("转账失败");
        }
    }
}

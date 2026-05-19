package com.hyw.mytest.service.impl;

import com.hyw.mytest.entity.AccountEnd;
import com.hyw.mytest.mapper.AccountMapper2;
import com.hyw.mytest.service.AccountService2;
import org.aspectj.apache.bcel.classfile.annotation.RuntimeAnnos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * ClassName: AccountServiceImpl2
 * Description:
 *
 * @Author jekny
 * @Create 2026/5/19 17:39
 * @Version 1.0
 */
@Service
public class AccountServiceImpl2 implements AccountService2 {
    @Autowired
    AccountMapper2 accountMapper2;
    @Override
    @Transactional
    public void transformal(String from, String to, BigDecimal balance) {
        AccountEnd fromAct = accountMapper2.selectAct(from);
        if (fromAct.getBalance().compareTo(balance)<0){
            throw  new  RuntimeException("余额不足");
        }
        fromAct.setBalance(fromAct.getBalance().subtract(balance));
        AccountEnd toAct = accountMapper2.selectAct(to);
        toAct.setBalance(toAct.getBalance().add(balance));
        int count = accountMapper2.updateAct(fromAct);
        count += accountMapper2.updateAct(toAct);
        if (count!=2){
            throw new RuntimeException("转账失败");
        }
    }
}

package com.hyw.mytest.service.impl;

import com.hyw.mytest.entity.Account;
import com.hyw.mytest.mapper.AccountMapper;
import com.hyw.mytest.service.AccountService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * ClassName: AccountServiceImpl
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/30 7:54
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    //下面的方法要连接数据库，肯定要一个数据库连接对象
    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public void transfer(String fromActNo, String toActNo, BigDecimal amount) {
        Account fromAct = accountMapper.selectByActNo(fromActNo);
        if(fromAct.getBalance().compareTo(amount) < 0){
            throw new RuntimeException("余额不足");
        }
        Account toAct = accountMapper.selectByActNo(toActNo);
        fromAct.setBalance(fromAct.getBalance().subtract(amount));
        toAct.setBalance(toAct.getBalance().add(amount));
        int i = accountMapper.updateBalanceByActNo(fromAct);
        i += accountMapper.updateBalanceByActNo(toAct);
        if (i != 2){
            throw new RuntimeException("转账失败");
        }
    }
}

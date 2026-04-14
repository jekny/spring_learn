package com.hyw.mytest.bean.service;

import com.hyw.mytest.bean.dao.UserBean;

/**
 * ClassName: UserService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 15:41
 * @Version 1.0
 */
public class UserService {
    private UserBean userBean;

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public void save(){
        userBean.insert();
    }



}

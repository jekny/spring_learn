package com.hyw.mytest.bean.service;

import com.hyw.mytest.bean.dao.ConstructBean;

/**
 * ClassName: ConstructService
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/14 18:17
 * @Version 1.0
 */
public class ConstructService {
    ConstructBean constructBean;

    public ConstructService(ConstructBean constructBean) {
        this.constructBean = constructBean;
    }

    public void save(){
        constructBean.hello();
    }
}

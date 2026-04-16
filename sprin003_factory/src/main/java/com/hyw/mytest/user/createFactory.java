package com.hyw.mytest.user;

/**
 * ClassName: createFactory
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/16 8:10
 * @Version 1.0
 */
public class createFactory {
    public static wuQiKu getWuQi(String wuqiname){
        wuQiKu wuqi = null;
        if("feiJi".equals(wuqiname)){
            wuqi = new feiJI();
        }else if("huoJian".equals(wuqiname)){
            wuqi = new huoJian();
        }
        return wuqi;
    }
}

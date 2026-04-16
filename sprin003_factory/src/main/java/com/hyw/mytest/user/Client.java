package com.hyw.mytest.user;

/**
 * ClassName: Client
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/16 8:24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        wuQiKu feiJi = createFactory.getWuQi("feiJi");
        feiJi.attack();

        wuQiKu huoJian = createFactory.getWuQi("huoJian");
        huoJian.attack();
    }
}

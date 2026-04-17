package com.hyw.mytest;

/**
 * ClassName: GongChang
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/17 21:32
 * @Version 1.0
 */
public class GongChang {
    public static WuQiKu getWuQi(String name){
        WuQiKu wuQiKu = null;
        if ("Qiang".equals(name)){
            wuQiKu = new Qiang();
        }else if ("ZhaDan".equals(name)){
            wuQiKu = new ZhaDan();
        }
        return wuQiKu;
    }

}

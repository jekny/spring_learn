package com.hyw.mytest;

/**
 * ClassName: QiangFactorySpesify
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/18 10:50
 * @Version 1.0
 */
public class QiangFactorySpesify extends FactoryAbstract{
    @Override
    public Wu CreatWu() {
        Wu wu = new Qiang();
        return wu;
    }
}

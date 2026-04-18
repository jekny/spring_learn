package com.hyw.mytest;

/**
 * ClassName: PaoFactorySpesify
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/18 10:51
 * @Version 1.0
 */
public class PaoFactorySpesify extends FactoryAbstract{
    @Override
    public Wu CreatWu() {
        Wu wu = new Pao();
        return wu;
    }
}

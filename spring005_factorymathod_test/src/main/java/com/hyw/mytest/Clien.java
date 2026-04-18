package com.hyw.mytest;

/**
 * ClassName: Clien
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/18 10:52
 * @Version 1.0
 */
public class Clien {
    public static void main(String[] args) {
        FactoryAbstract factoryAbstract = new QiangFactorySpesify();
        factoryAbstract.CreatWu().getWu();

        FactoryAbstract factoryAbstract1 = new PaoFactorySpesify();
        factoryAbstract1.CreatWu().getWu();
    }
}

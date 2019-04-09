package com.hekx.designMode01.factory.abstractFactory;

/**
 * 抽象工厂模式(Abastract Factory Pattern)是指提供一个创建一系列相关或相互依赖对象的接口，无须指定他们具体的类
 */
public class Test {
    public static void main(String[] ags) {
        System.out.println("###### 抽象工厂模式 ######");

        ICarFactory factory = new BenzCarFactory();
        factory.creatEngine().getEngineName();
        factory.creatTyre().getTyreName();

        factory = new BmwCarFactory();
        factory.creatEngine().getEngineName();
        factory.creatTyre().getTyreName();
    }
}

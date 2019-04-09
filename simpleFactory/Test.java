package com.hekx.designMode01.factory.simpleFactory;


/**
 * 简单工厂实例
 */
public class Test {
    public static void main(String[] ags) {
        System.out.println("###### 简单工厂模式 ######");
        ICar car = SimpleFactory.makeCar(SimpleFactory.BRAND_BENZ);
        car.getBrand();

        car = SimpleFactory.makeCar(SimpleFactory.BRAND_BMW);
        car.getBrand();
    }
}

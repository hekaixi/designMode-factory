package com.hekx.designMode01.factory.methodFactory;

/**
 * 工厂方法模式(Fatory Method Pattern)是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类。
 * 工厂方法让类的实例化推迟到子类中进行。
 */
public class Test {
    public static void main(String[] ags) {
        System.out.println("###### 工厂方法模式 ######");
        ICar car = null;
        BenzCarFactory benzFactory = new BenzCarFactory();
        car = benzFactory.makeCar();
        car.getBrand();

        BmwCarFactory bmwFactory = new BmwCarFactory();
        car = bmwFactory.makeCar();
        car.getBrand();

    }
}

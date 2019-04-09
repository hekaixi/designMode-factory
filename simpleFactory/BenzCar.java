package com.hekx.designMode01.factory.simpleFactory;

public class BenzCar implements ICar{
    @Override
    public void getBrand() {
        System.out.println("Benz");
    }
}

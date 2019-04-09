package com.hekx.designMode01.factory.methodFactory;

public class BenzCar implements ICar{
    @Override
    public void getBrand() {
        System.out.println("Benz");
    }
}

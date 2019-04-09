package com.hekx.designMode01.factory.simpleFactory;

public class BmwCar implements ICar{
    @Override
    public void getBrand() {
        System.out.println("Bmw");
    }
}

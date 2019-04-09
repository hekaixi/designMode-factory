package com.hekx.designMode01.factory.methodFactory;

public class BenzCarFactory implements ICarFactory{
    @Override
    public ICar makeCar() {
        return new BenzCar();
    }
}

package com.hekx.designMode01.factory.methodFactory;

public class BmwCarFactory implements ICarFactory{
    @Override
    public ICar makeCar() {
        return new BmwCar();
    }
}

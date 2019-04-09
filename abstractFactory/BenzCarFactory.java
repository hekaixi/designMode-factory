package com.hekx.designMode01.factory.abstractFactory;

public class BenzCarFactory implements ICarFactory{
    @Override
    public IEngine creatEngine() {
        return new BenzEngine();
    }

    @Override
    public ITyre creatTyre() {
        return new BenzTyre();
    }
}

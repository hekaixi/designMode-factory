package com.hekx.designMode01.factory.abstractFactory;

public class BmwCarFactory implements ICarFactory{
    @Override
    public IEngine creatEngine() {
        return new BmwEngine();
    }

    @Override
    public ITyre creatTyre() {
        return new BmwTyre();
    }
}

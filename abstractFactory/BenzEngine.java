package com.hekx.designMode01.factory.abstractFactory;

public class BenzEngine implements IEngine{
    @Override
    public void getEngineName() {
        System.out.println("BenzEngine");
    }
}

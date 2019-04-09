package com.hekx.designMode01.factory.abstractFactory;

public class BmwEngine implements IEngine{
    @Override
    public void getEngineName() {
        System.out.println("BmwEngine");
    }
}

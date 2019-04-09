package com.hekx.designMode01.factory.abstractFactory;

public class BenzTyre implements ITyre{
    @Override
    public void getTyreName() {
        System.out.println("BenzTyre");
    }
}

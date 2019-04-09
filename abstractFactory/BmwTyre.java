package com.hekx.designMode01.factory.abstractFactory;

public class BmwTyre implements ITyre{
    @Override
    public void getTyreName() {
        System.out.println("BmwTyre");
    }
}

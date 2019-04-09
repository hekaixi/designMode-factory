package com.hekx.designMode01.factory.simpleFactory;

public class SimpleFactory {
    public static final String BRAND_BMW = "bmw";
    public static final String BRAND_BENZ = "benz";

    public static ICar makeCar(String brandName){
        switch (brandName) {
            case BRAND_BMW:
                return new BmwCar();
            case BRAND_BENZ:
                return new BenzCar();
            default:
                return null;
        }
    }
}

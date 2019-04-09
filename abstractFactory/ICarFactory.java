package com.hekx.designMode01.factory.abstractFactory;

public interface ICarFactory {
    IEngine creatEngine();
    ITyre creatTyre();
}

package com.aj.factory;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.create().create();

        FactoryB factoryB = new FactoryB();
        factoryB.create().create();
    }
}

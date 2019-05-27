package com.aj.abfactory;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        factory.getProductA().create();
        factory.getProductB().create();
    }
}

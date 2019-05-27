package com.aj.abfactory;

/**
 * @author Gjing
 **/
public class FactoryA implements Factory {
    @Override
    public Product getProductA() {
        return new ProductAa();
    }

    @Override
    public Product getProductB() {
        return new ProductBb();
    }
}

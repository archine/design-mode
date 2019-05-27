package com.aj.factory;

/**
 * @author Gjing
 **/
public class ProductA implements Product {
    @Override
    public void create() {
        System.out.println("产品A");
    }
}

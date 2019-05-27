package com.aj.factory;

/**
 * @author Gjing
 **/
public class ProductB implements Product {
    @Override
    public void create() {
        System.out.println("产品B");
    }
}

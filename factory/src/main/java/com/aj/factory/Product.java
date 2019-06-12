package com.aj.factory;

/**
 * @author Gjing
 * 抽象产品
 **/
interface Product {
    void create();
}

/**
 * 产品A
 */
class ProductA implements Product {
    @Override
    public void create() {
        System.out.println("产品A");
    }
}

/**
 * 产品B
 */
class ProductB implements Product {
    @Override
    public void create() {
        System.out.println("产品B");
    }
}

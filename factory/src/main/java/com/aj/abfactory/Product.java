package com.aj.abfactory;

/**
 * @author Gjing
 * 抽象产品
 **/
abstract class Product {
    abstract void create();
}

/**
 * 抽象产品A
 */
abstract class ProductA extends Product {
    @Override
    abstract void create();
}

/**
 * 抽象产品A的具体某个产品
 */
class ProductAa extends ProductA {
    @Override
    void create() {
        System.out.println("产品A");
    }
}

/**
 * 抽象产品B
 */
abstract class ProductB extends Product {
    @Override
    abstract void create();
}

/**
 * 抽象产品B的具体某个产品
 */
class ProductBb extends ProductB {
    @Override
    void create() {
        System.out.println("产品B");
    }
}

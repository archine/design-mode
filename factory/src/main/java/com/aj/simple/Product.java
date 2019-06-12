package com.aj.simple;

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

/**
 * 产品工厂
 */
class ProductFactory {
    Product getProduct(Integer type) {
        switch (type) {
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();
            default:
                throw new NullPointerException("没有你要的产品");
        }
    }
}

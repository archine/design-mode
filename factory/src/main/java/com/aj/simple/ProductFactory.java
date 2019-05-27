package com.aj.simple;

/**
 * @author Gjing
 **/
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

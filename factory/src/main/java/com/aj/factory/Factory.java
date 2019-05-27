package com.aj.factory;

/**
 * @author Gjing
 * 抽象工厂
 **/
public interface Factory {
    /**
     * 生产产品
     * @return Product
     */
    Product create();
}

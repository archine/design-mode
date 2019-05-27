package com.aj.factory;

/**
 * @author Gjing
 * 工厂B负责创建产品B
 **/
public class FactoryB implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}

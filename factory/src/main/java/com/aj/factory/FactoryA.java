package com.aj.factory;

/**
 * @author Gjing
 * 创建产品A 的工厂A
 **/
public class FactoryA implements Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}

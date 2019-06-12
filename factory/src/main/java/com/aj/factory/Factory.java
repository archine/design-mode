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

/**
 * @author Gjing
 * 创建产品A 的工厂A
 **/
class FactoryA implements Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}

/**
 * @author Gjing
 * 工厂B负责创建产品B
 **/
class FactoryB implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}

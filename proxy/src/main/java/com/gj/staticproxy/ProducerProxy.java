package com.gj.staticproxy;

/**
 * @author Gjing
 * 定义产家的代理商,也具备卖货的功能
 **/
public class ProducerProxy implements Producer {
    private Producer producer;

    ProducerProxy(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void sell() {
        System.out.println("--------小卖部卖货前--------");
        producer.sell();
        System.out.println("--------小卖部卖货后--------");
    }
}

/**
 * @author Gjing
 */
class StaticProxyTest {
    public static void main(String[] args) {
        Producer producer = new Canteen();
        ProducerProxy personProxy = new ProducerProxy(producer);
        personProxy.sell();
    }
}


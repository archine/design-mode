package com.gj.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author Gjing
 **/
public class Producer2Proxy {
    public static void main(String[] args) {
        Producer2 producer2 = new Canteen2();
        Producer2 producerProxy = (Producer2) Proxy.newProxyInstance(producer2.getClass().getClassLoader(),
                producer2.getClass().getInterfaces(), (proxy, method, args1) -> {
                    System.out.println("----------小卖部卖货前--------");
                    Object invoke = method.invoke(producer2,args1);
                    System.out.println("----------小卖部卖货后--------");
                    return invoke;
                });
        producerProxy.sell();
    }
}

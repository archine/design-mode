package com.gj.dynamicproxy.jdk;

/**
 * @author Gjing
 * 定义商家
 **/
public class Canteen2 implements Producer2 {
    @Override
    public void sell() {
        System.out.println("小卖部进行卖货");
    }
}

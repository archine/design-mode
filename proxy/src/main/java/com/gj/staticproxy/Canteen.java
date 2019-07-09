package com.gj.staticproxy;

/**
 * @author Gjing
 * 定义一个小卖部,帮产家卖货
 **/
public class Canteen implements Producer {
    @Override
    public void sell() {
        System.out.println("小卖部进行卖货");
    }
}

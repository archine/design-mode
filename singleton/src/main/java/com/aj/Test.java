package com.aj;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
        System.out.println(Singleton.getInstance().get());
    }
}

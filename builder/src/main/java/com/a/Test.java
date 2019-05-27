package com.a;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) {
        Custom custom = Custom.builder().age(11).address("哈哈哈").build();
        System.out.println(custom.toString());
    }
}

package com.aj;

/**
 * @author Gjing
 * 具体被观察者
 **/
public class SubjectA extends Subject {
    public void click() {
        System.out.println("按钮被点击");
        notifyObserver();
    }
}

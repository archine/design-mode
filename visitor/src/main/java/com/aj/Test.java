package com.aj;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) {
        //创建被观察者
        AbstractSubjectA subjectA = new AbstractSubjectA();
        //添加观察者
        subjectA.add(new ListenerA());
        subjectA.add( new ListenerB());
        //被观察者行动
        subjectA.click();
    }
}

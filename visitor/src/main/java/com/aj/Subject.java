package com.aj;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gjing
 **/
abstract class Subject {
    /**
     * 观察者对象的集合
     */
    private List<Listener> listenerList = new ArrayList<>();

    /**
     * 添加观察者
     * @param listener 观察者
     */
    void add(Listener listener) {
        listenerList.add(listener);
        System.out.println("添加观察者了。。。。。。。。。");
    }

    /**
     * 删除观察者
     * @param listener 观察者
     */
    void delete(Listener listener) {
        listenerList.remove(listener);
        System.out.println("删除观察者了。。。。。。。。。");
    }

    /**
     * 通知所有观察者
     */
    void notifyObserver() {
        for (Listener listener : listenerList) {
            listener.update("按钮被点击。。。。。。");
        }
    }
}

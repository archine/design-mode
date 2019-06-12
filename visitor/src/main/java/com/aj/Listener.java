package com.aj;

/**
 * @author Gjing
 * 抽象观察者
 **/
public interface Listener {
    String getName();

    /**
     * 通知更新方法
     *
     * @param message 消息
     */
    void update(String message);
}

/**
 * @author Gjing
 * A观察者
 **/
class ListenerA implements Listener {
    @Override
    public String getName() {
        return "观察者A";
    }

    @Override
    public void update(String message) {
        System.out.println("观察者A收到消息更新：" + message);
    }
}

/**
 * @author Gjing
 * 观察者B
 **/
class ListenerB implements Listener {
    @Override
    public String getName() {
        return "观察者B";
    }

    @Override
    public void update(String message) {
        System.out.println("观察者B收到消息更新：" + message);
    }
}
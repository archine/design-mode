package com.aj;

/**
 * @author Gjing
 **/
public enum  Singleton implements MySingleton{
    /**
     * 实例
     */
    INSTANCE{
        @Override
        public void doSomething() {
            System.out.println("执行方法1。。。");
        }
    }
}

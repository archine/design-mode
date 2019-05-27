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

        }
        @Override
        public MySingleton get() {
            return null;
        }
    }
}

package com.gj.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Gjing
 **/
public class CgLibProxy implements MethodInterceptor {
    private Canteen canteen;

    CgLibProxy(Canteen canteen) {
        this.canteen = canteen;
    }

    Canteen proxy() {
        // 创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        // 设置代理的目标类
        enhancer.setSuperclass(Canteen.class);
        // 设置回调方法, this代表是当前类, 因为当前类实现了CallBack
        enhancer.setCallback(this);
        return (Canteen) enhancer.create();
    }

    //这个方法就是回调方法了
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----------小卖部卖货前----------");
        Object invoke = method.invoke(canteen, objects);
        System.out.println("----------小卖部卖货后----------");
        return invoke;
    }
}

/**
 * @author Gjing
 */
class TestCglibProxy{
    public static void main(String[] args) {
        Canteen canteen = new Canteen();
        Canteen proxy = new CgLibProxy(canteen).proxy();
        proxy.sell();
    }
}

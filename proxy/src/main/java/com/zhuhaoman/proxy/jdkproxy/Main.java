package com.zhuhaoman.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Main
 * @Description JDK动态代理
 * 动态代理：通过一个代理类完成全部的代理功能
 * <p>
 * 动态代理就是想办法，根据接口或目标对象，计算出代理类的字节码，然后再加载到JVM中使用
 * @Author zhuhaoman
 * @Date 2020/5/28 11:14
 **/
public class Main {
    //获取动态代理生成的代理类的对象必须借助Proxy类的newProxyInstance()
    public static void main(String[] args) {
        B b = new B();
        ClassLoader classLoader = b.getClass().getClassLoader();

        Class[] interfaces = b.getClass().getInterfaces();

        InvocationHandler invocationHandler = new BHandler(b);

        //取得代理对象 ,要绑定接口 jdk动态代理缺陷
        IB proxy = (IB) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        System.out.println("打印代理对象的处理器："+Proxy.getInvocationHandler(proxy).getClass().getName());
        proxy.f();
    }
}

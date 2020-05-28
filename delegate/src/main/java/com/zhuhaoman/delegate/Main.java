package com.zhuhaoman.delegate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/22 18:15
 **/
public class Main {
    public static void main(String[] args) {
        InvocationHandler handler = (proxy, method, args1) -> {
            System.out.println(method);
            if (method.getName().equals("morning")) {
                System.out.println("good morning, " + args1[0]);
            }
            return null;
        };

        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                handler);

        hello.morning("小仙女");
    }
}

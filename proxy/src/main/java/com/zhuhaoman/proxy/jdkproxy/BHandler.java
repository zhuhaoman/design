package com.zhuhaoman.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName B
 * @Description
 * @Author zhuhaoman
 * @Date 2020/5/28 11:12
 **/
public class BHandler implements InvocationHandler {
    //被代理对象，实际方法的执行者
    Object target;

    public BHandler(Object target) {
        this.target = target;
    }

    //JDK的动态代理机制只能代理实现了接口的类
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //新添加的代码逻辑
        System.out.println("jdk动态代理开始。。。");
        Object result = method.invoke(target, args); //调用target的method方法
        //添加代码处理逻辑
        System.out.println("jdk动态代理结束。。。");
        return result;
    }
}

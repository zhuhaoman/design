package com.zhuhaoman.proxy.staticproxy;

/**
 * @ClassName AProxy
 * @Description 代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用
 * @Author zhuhaoman
 * @Date 2020/5/28 10:58
 **/
public class AProxy implements IA {
    //利用组合
    private IA a;

    public AProxy(IA a) {
        this.a = a;
    }

    @Override
    public void f() {
        //新添加的代码逻辑
        a.f();
        //新添加的代码逻辑
    }
}

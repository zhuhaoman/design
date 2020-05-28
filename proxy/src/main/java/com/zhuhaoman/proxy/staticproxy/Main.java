package com.zhuhaoman.proxy.staticproxy;

/**
 * @ClassName Main
 * @Description
 *      缺陷：每个代理类只能为一个接口进行代理
 * @Author zhuhaoman
 * @Date 2020/5/28 11:02
 **/
public class Main {
    public static void main(String[] args) {
        //代理类持有原对象的引用
        IA a1 = new AProxy(new A());
        a1.f();
    }
}

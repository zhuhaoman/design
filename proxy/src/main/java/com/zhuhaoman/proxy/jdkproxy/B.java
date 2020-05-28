package com.zhuhaoman.proxy.jdkproxy;

/**
 * @ClassName B
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/28 12:43
 **/
public class B implements IB {
    @Override
    public void f() {
        System.out.println("B对象方法被调用。。。");
    }
}

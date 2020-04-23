package com.zhuhaoman.adaptor.duixiang;

/**
 * @ClassName Adaptor
 * @Description
 * @Author zhuhaoman
 * @Date 2020/4/23 13:05
 **/
public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa(); //委托给Adaptee
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

package com.zhuhaoman.adaptor.lei;

/**
 * @ClassName Adaptor
 * @Description Adaptor 将 {@link com.zhuhaoman.adaptor.lei.Adaptee} 转化成一组符合 {@link ITarget} 接口定义的接口
 * @Author zhuhaoman
 * @Date 2020/4/23 13:01
 **/
public class Adaptor extends Adaptee implements ITarget{
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

    @Override
    public void f3() {
        // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
    }
}

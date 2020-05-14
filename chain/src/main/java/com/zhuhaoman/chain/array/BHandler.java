package com.zhuhaoman.chain.array;

/**
 * @ClassName BHandler
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:55
 **/
public class BHandler implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        //业务处理
        System.out.println("BHandler业务处理");
        return false;
    }
}

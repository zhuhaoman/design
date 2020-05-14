package com.zhuhaoman.chain.array;

/**
 * @ClassName AHandler
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:54
 **/
public class AHandler implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        //业务处理
        System.out.println("AHandler业务处理");
        return false;
    }
}

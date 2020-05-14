package com.zhuhaoman.chain.linked;

/**
 * @ClassName AHandler
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:03
 **/
public class AHandler extends Handler {


    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //业务处理
        System.out.println("AHandler业务处理");
        return handled;
    }
}

package com.zhuhaoman.chain.linked;

/**
 * @ClassName BHandler
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:03
 **/
public class BHandler extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("BHandler业务处理");
        return handled;
    }
}

package com.zhuhaoman.chain.linked;

/**
 * @ClassName Handler
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 16:56
 **/
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        //通过handled来控制是否继续向下传播
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}

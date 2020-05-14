package com.zhuhaoman.chain.linked;

import com.zhuhaoman.chain.linked.Handler;

/**
 * @ClassName HandlerChain
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:06
 **/
public class HandlerChain {
    private Handler header = null;
    //记录链尾是为了方便添加处理器

    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if (header == null) {
            header = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (header != null) {
            header.handle();
        }
    }
}

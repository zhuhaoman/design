package com.zhuhaoman.chain.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HandlerChain
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:56
 **/
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}

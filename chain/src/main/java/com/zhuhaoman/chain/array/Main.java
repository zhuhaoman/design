package com.zhuhaoman.chain.array;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/14 17:58
 **/
public class Main {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new AHandler());
        chain.addHandler(new BHandler());
        chain.handle();
    }
}

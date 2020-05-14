package com.zhuhaoman.chain.linked;

public class Main {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new AHandler());
        chain.addHandler(new BHandler());
        chain.handle();
    }

}

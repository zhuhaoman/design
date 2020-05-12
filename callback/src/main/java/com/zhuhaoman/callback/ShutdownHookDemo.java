package com.zhuhaoman.callback;

/**
 * @ClassName ShutdownHookDemo
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/12 15:44
 **/
public class ShutdownHookDemo {
    private static class ShutdownHook extends Thread {
        @Override
        public void run() {
            System.out.println("I am called during shutting down");
        }
    }
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }
}

package com.zhuhaoman.callback;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/12 13:42
 **/
public class AClass {
    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(() -> System.out.println("call back me"));
    }
}

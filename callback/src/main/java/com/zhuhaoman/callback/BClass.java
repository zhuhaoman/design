package com.zhuhaoman.callback;

/**
 * @ClassName BClass
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/12 13:41
 **/
public class BClass {
    public void process(ICallback callback) {
        callback.methodToCallback();
    }
}

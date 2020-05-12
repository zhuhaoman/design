package com.zhuhaoman.di;

/**
 * @ClassName RedisCounter
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/7 12:51
 **/
public class RedisCounter {
    private String port;

    private Integer value;

    public RedisCounter(String port, Integer value) {
        this.port = port;
        this.value = value;
    }
}

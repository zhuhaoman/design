package com.zhuhaoman.di;

/**
 * @ClassName RateLimiter
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/7 12:48
 **/
public class RateLimiter {
    private RedisCounter redisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }
}

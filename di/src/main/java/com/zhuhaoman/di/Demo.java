package com.zhuhaoman.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/7 12:54
 **/
public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        rateLimiter.toString();
    }
}

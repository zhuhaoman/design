package com.zhuhaoman.strategy.factory.annotation;


import java.lang.reflect.Method;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/15 17:21
 **/
public class Test {

    @SortAlg(name = "Test")
    public static void main(String[] args) {
        Class cls = Test.class;
        try {
            Method method = cls.getMethod("main", String[].class);
            SortAlg sortAlg = method.getAnnotation(SortAlg.class);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

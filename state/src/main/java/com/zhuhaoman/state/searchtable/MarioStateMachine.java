package com.zhuhaoman.state.searchtable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName MarioStateMachine
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/15 13:39
 **/
public class MarioStateMachine {
    private int score;


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        Iterator iterator = names.iterator();
        System.out.println(iterator.next());

        names.add(0,"x");
        System.out.println(iterator.next());
    }
}

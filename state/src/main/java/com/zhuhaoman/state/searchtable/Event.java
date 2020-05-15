package com.zhuhaoman.state.searchtable;

/**
 * @ClassName Event
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/5/15 13:34
 **/
public enum Event {
    //
    GOT_MUSHROOM(0), GOT_CAPE(1), GOT_FIRE(2), MET_MONSTER(3);

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

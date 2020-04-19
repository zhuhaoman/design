package com.zhuhaoman.ocp.newOCP;


import lombok.Getter;
import lombok.Setter;

/**
 * 封装check的入参
 * {@link com.zhuhaoman.ocp.old.Alert#check(String, long, long, long)}
 */
@Setter
@Getter
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
}

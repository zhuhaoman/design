package com.zhuhaoman.ocp.old;

//告警通知类，支持短信，邮件，微信，手机。。。
public interface Notification {
    void notify(NotificationEmergencyLevel level, String message);
}

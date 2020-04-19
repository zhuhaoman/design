package com.zhuhaoman.ocp.old;


//该代码使基础修改的方式来实现新功能的
public class Alert {
    private AlertRule rule;

    private Notification notification;

    public Alert(AlertRule alertRule, Notification notification) {
        this.rule = alertRule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatchRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }

        //若添加新功能，则需要接着加if-else

    }
}

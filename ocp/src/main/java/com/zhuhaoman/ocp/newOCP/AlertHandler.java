package com.zhuhaoman.ocp.newOCP;

import com.zhuhaoman.ocp.old.AlertRule;
import com.zhuhaoman.ocp.old.Notification;

public abstract class AlertHandler {
    protected AlertRule rule;

    protected Notification notification;

    public AlertHandler(AlertRule alertRule, Notification notification) {
        this.rule = alertRule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}

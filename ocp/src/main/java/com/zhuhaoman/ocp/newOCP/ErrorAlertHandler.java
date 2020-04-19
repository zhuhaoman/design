package com.zhuhaoman.ocp.newOCP;

import com.zhuhaoman.ocp.old.AlertRule;
import com.zhuhaoman.ocp.old.Notification;
import com.zhuhaoman.ocp.old.NotificationEmergencyLevel;

public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}

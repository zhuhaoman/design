package com.zhuhaoman.ocp.newOCP;

import java.util.ArrayList;
import java.util.List;

/**
 * 改写{@see com.zhuhaoman.ocp.old.Alert}
 */
public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }

}

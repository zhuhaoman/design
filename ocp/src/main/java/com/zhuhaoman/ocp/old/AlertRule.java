package com.zhuhaoman.ocp.old;

import lombok.Getter;
import lombok.Setter;

//存储告警规则，可以自由设置
@Setter
@Getter
public class AlertRule {

    private MatchRule matchRule;

    public MatchRule getMatchRule(String api) {
        return matchRule;
    }

}

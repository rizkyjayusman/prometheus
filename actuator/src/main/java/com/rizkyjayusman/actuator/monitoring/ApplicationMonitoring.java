package com.rizkyjayusman.actuator.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ApplicationMonitoring {

    @Autowired
    private BuildProperties buildProperties;

    public Map<String, Object> getApplicationVersion() {
        Map<String, Object> res = new HashMap<>();
        res.put("version", buildProperties.getVersion());
        res.put("buildTimestamp", buildProperties.getTime());
//        res.put("gitCommit", "");
        return res;
    }
}

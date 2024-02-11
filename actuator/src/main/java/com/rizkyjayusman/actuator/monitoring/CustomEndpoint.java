package com.rizkyjayusman.actuator.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id="custom")
@Component
public class CustomEndpoint {

    @Autowired
    private EnvironmentMonitoring environmentMonitoring;

    @Autowired
    private SystemPropertiesMonitoring systemPropertiesMonitoring;

    @Autowired
    private ApplicationMonitoring applicationMonitoring;

    @ReadOperation
    public Map<String, Object> custom() {
        Map<String, Object> map = new HashMap<>();
        map.put("environment",  environmentMonitoring.getEnvironmentName());
        map.put("profiles",  environmentMonitoring.getProfiles());
        map.put("systemProperties", systemPropertiesMonitoring.getSystemProperties());
        map.put("applicationProperties", applicationMonitoring.getApplicationVersion());
        map.put("serverHeader", environmentMonitoring.getServerProperties());
        return map;
    }

}

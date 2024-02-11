package com.rizkyjayusman.actuator.monitoring;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Component
public class SystemPropertiesMonitoring {

    public Map<String, String> getSystemProperties() {
        Properties properties = System.getProperties();
        Map<String, String> sysProp = new HashMap<>();
        sysProp.put("javaVersion", properties.getProperty("java.version"));
        sysProp.put("javaBasePath", properties.getProperty("java.home"));
        sysProp.put("operationSystemName", properties.getProperty("os.name"));
        sysProp.put("operationSystemVersion", properties.getProperty("os.version"));
        sysProp.put("operationSystemArch", properties.getProperty("os.arch"));
        return sysProp;
    }
}

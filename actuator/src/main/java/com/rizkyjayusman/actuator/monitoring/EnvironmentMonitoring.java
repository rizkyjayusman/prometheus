package com.rizkyjayusman.actuator.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class EnvironmentMonitoring {

    @Autowired
    private ServerProperties serverProperties;

    @Autowired
    private Environment environment;

    public List<String> getProfiles() {
        String [] defaultProfiles = this.environment.getDefaultProfiles();
        List<String> profiles = new LinkedList<>(List.of(defaultProfiles));
        String[] activeProfiles = this.environment.getActiveProfiles();
        profiles.addAll(List.of(activeProfiles));
        return profiles;
    }

    public String getEnvironmentName() {
        return environment.getProperty("app.environment.name");
    }

    public ServerProperties getServerProperties() {
        return serverProperties;
    }
}

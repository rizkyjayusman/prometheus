package com.rizkyjayusman.actuator.controller;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private MeterRegistry meterRegistry;

    @GetMapping("/2xx")
    public String simulate2xxResponse() {
        meterRegistry.counter("orders.2xx","status","OK").increment();
        return "Got 2xx Response";
    }

    @GetMapping("/5xx")
    public String simulate5xxResponse() {
        meterRegistry.counter("orders.5xx","status","NOTOK").increment();
        return "Got 5xx Response";
    }

    @PostMapping("/alert-hook")
    public void receiveAlertHook(@RequestBody Map request) throws Exception {
        System.out.println(request);
    }

}

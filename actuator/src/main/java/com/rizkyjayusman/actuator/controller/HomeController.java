package com.rizkyjayusman.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("houseController")
public class HomeController {

    @GetMapping("/home")
    public void home() {}

}

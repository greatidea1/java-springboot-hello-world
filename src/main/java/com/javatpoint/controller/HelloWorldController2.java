package com.javatpoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api2")
public class HelloWorldController2 {


    @RequestMapping("/greetings")
    public String hello() {
        return "Greetings from micro service";
    }

    @RequestMapping("/ordercheck")
    public String ordercheck() {
        return "check1";
    }


    @RequestMapping("/check1")
    public String check1() {
        return "check1";
    }


    @RequestMapping("/check2")
    public String check2() {
        return "check2";
    }

}

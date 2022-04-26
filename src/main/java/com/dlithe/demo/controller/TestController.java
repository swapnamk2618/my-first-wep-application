package com.dlithe.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public String myFirstMethod() {
        return "Hey welcome to java swapna";
    }
}

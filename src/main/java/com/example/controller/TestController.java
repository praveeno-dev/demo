package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // http - get, post, patch, option

    // path variable, query param, request param

    @GetMapping(value = "print")
    public String printName() {
        return "Welcome to spring boot";
    }

}

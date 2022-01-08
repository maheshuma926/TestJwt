package com.test.jwt.api.testjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {
        return "Hello World ".concat(name) ;
    }

    @GetMapping("/test2/{name}")
    public String testNewEndpoint(@PathVariable String name) {
        return "Hello World ".concat(name) ;
    }

    @GetMapping("/test3/{name}")
    public String testNewEndpoint3(@PathVariable String name) {
        return "Hello World ".concat(name) ;
    }

}

package com.lazrb.mvnsampleapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Value("${custom.user.name}")
    public String userName;

    @GetMapping("/")
    public String index() {
        log.info("Hi {}", userName);
        return "Hello world from Spring Boot";
    }

    @GetMapping("/error")
    public String error() throws Exception {
        throw new Exception("Something bad happened!");
    }
}

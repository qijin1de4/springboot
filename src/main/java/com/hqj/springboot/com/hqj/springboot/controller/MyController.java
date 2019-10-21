package com.hqj.springboot.com.hqj.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {

    @RequestMapping("/")
    public String index() {
        log.info("hello log");
        return "Greetings from Spring Boot!";
    }
}

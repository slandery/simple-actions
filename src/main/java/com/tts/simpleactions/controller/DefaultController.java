package com.tts.simpleactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String getMessage() {
        return "Hello, I am using CI/CD!";
    }
}
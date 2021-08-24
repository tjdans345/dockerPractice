package com.docker.dockerpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerTestController {

    @GetMapping({"/", "/main"})
    public String getTestData() {
        return "Hello, World";
    }


}

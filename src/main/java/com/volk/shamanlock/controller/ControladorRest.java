package com.volk.shamanlock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar() {
        return "Finally, my first web page wit SpringBoot";
    }

    @GetMapping("/about")
    public String presentar() {
        return "Hello, my name is loki, the god deceiver of gods";
    }
}

package com.db2rest.oauth2.resourceserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String message() {
        return "Authentication Successful!";
    }
}

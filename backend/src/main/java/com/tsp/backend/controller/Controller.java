package com.tsp.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    public String homePage() {
        return "<h1>Home Page</h1>";
    }

}

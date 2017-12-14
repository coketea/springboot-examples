package com.coketea.example.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/getName")
    public String getName() {
        return "Johnson Wong";
    }
}

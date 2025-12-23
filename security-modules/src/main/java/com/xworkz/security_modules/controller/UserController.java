package com.xworkz.security_modules.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("")
    public String user(HttpServletRequest httpServletRequest){

        return "Hello spring security"+httpServletRequest.getSession().getId();
    }
}

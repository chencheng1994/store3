package com.J2103.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/handler1")
    public String handler1(){
        System.out.println("handler1-----");
        return "ok";

    }


}

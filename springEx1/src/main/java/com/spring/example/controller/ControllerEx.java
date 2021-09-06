package com.spring.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEx {

    @GetMapping("/name")
    public String name(@RequestParam(required = false) String name){
        return " hello did "+ (name!=null?name:"");
    }
}

package com.example.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {


    @RequestMapping
    public String getTest(){
        return "OK!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }
}

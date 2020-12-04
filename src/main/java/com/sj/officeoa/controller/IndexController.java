package com.sj.officeoa.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IndexController {


    @GetMapping("/")
    public  String sayHello(){

        return  "Hello Spring111";
    }
}

package com.vaibhav.springmvc.Controllers;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String homeRoute(){
        return "Hello from home ✌️";
    }
}

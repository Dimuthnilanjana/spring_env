package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public String helloPath() {
        return "Hello from Under World!";
    }

//    @GetMapping("/greet/{name}")
//    public String greetName(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
}

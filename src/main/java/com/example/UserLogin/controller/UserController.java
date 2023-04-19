package com.example.UserLogin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<String>hello(){
        return ResponseEntity.ok("Hi There from secure Endpoint");
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}

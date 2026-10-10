package com.example.lumio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController  {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/simulator")
    public String simulator() {
        return "simulator";
    }

    @GetMapping("/impact")
    public String impact() {
        return "impact";
    }

    @GetMapping("/notification")
    public String notification() {
        return "notification";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


}
package com.example.shop2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class main {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "no";
    }
}
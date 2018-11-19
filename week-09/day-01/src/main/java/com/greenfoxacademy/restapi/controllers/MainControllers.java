package com.greenfoxacademy.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

}

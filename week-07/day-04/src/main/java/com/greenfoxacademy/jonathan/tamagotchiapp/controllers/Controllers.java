package com.greenfoxacademy.jonathan.tamagotchiapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controllers {

    @GetMapping(value = "")
    public String home(Model model, @RequestParam String name){
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping(value = "/login")
    public String getLogin(@RequestParam String name){
        return "login";
    }

    @PostMapping (value = "/login")
    public String postLogin(@RequestParam String name){
        return "";
    }
}

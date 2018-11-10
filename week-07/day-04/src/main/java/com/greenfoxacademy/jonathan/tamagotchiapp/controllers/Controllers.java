package com.greenfoxacademy.jonathan.tamagotchiapp.controllers;

import com.greenfoxacademy.jonathan.tamagotchiapp.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Controllers {

    List<Fox> foxes;

    public Controllers(){
        foxes = new ArrayList<>();
        Fox patrik = new Fox("Patrik");
        patrik.setFood("Burger");
        foxes.add(patrik);
        foxes.add(new Fox("Michel"));
        foxes.add(new Fox("Jacques"));
    }


    @GetMapping(value = "home/{name}/show")
    public String home(Model model, @PathVariable String name){
        Fox myFox = foxes.stream()
                .filter(f -> f.getName().equals(name))
                .findFirst()
                .get();
        model.addAttribute("fox", myFox);
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

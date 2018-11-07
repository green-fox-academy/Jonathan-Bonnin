package com.gfa.w7d3.controllers;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller


public class Controller {

    @GetMapping(value = "/useful")
    public String useful(){
        return "useful";
    }
}

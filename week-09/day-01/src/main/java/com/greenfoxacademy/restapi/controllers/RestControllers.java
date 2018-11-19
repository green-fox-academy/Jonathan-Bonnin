package com.greenfoxacademy.restapi.controllers;

import com.greenfoxacademy.restapi.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    @Autowired
    Service service;

    @GetMapping("/doubling")
    public Object doubles(@RequestParam(value = "input", required = false) Integer input) {
        return service.doubling(input);
    }
}

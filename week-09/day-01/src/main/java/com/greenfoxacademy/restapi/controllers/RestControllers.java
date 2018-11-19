package com.greenfoxacademy.restapi.controllers;

import com.greenfoxacademy.restapi.models.OperationAndNumbers;
import com.greenfoxacademy.restapi.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class RestControllers {

    @Autowired
    Service service;

    @GetMapping("/doubling")
    public Object doubles(@RequestParam(value = "input", required = false) Integer input) {
        return service.doubling(input);
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        return service.greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object appender(@PathVariable String appendable) {
        return service.appendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable String action, @RequestBody(required = false) HashMap<String, Object> until) {
        int input = (int) until.get("until");
        return service.doUntil(action, input);
    }

    @PostMapping("arrays")
    public Object operateNumbers(@RequestBody(required = false) OperationAndNumbers operationAndNumbers){

        return service.operateNumbers(operationAndNumbers);
    }


}

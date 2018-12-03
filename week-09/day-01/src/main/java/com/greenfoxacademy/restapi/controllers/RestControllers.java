package com.greenfoxacademy.restapi.controllers;

import com.greenfoxacademy.restapi.models.Entries;
import com.greenfoxacademy.restapi.models.Log;
import com.greenfoxacademy.restapi.models.OperationAndNumbers;
import com.greenfoxacademy.restapi.repository.LogRepository;
import com.greenfoxacademy.restapi.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

@RestController
public class RestControllers {

    @Autowired
    Service service;
    @Autowired
    LogRepository logRepository;

    Entries entries = new Entries();

    @GetMapping("/doubling")
    public Object doubles(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            Log log = new Log(new Date(), "/doubling", "input=" + (int) input);
            logRepository.save(log);
        }
        return service.doubling(input);
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        if (name != null && title != null) {
            Log log = new Log(new Date(), "/greeter", "name=" + name + "&title=" + title);
            logRepository.save(log);
        }
        return service.greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object appender(@PathVariable String appendable) {
        Log log = new Log(new Date(), "/appenda", "appendable=" + appendable);
        logRepository.save(log);
        return service.appendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable String action, @RequestBody(required = false) HashMap<String, Object> until) {
        int input = (int) until.get("until");
        Log log = new Log(new Date(), "/dountil", "action=" + action + "&until=" + input);
        logRepository.save(log);
        return service.doUntil(action, input);
    }

    @PostMapping("/arrays")
    public Object operateNumbers(@RequestBody(required = false) OperationAndNumbers operationAndNumbers) {
        Log log = new Log(new Date(), "/arrays", "what=" + operationAndNumbers.getWhat() + "&numbers=" + operationAndNumbers.numbersToString());
        logRepository.save(log);
        return service.operateNumbers(operationAndNumbers);
    }

    @GetMapping("/log")
    public Entries showLogs() {
        entries.setEntries(logRepository.findAll());
        entries.setEntry_count(entries.getEntries().size());
        return entries;
    }
}

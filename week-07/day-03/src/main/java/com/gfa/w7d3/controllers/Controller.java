package com.gfa.w7d3.controllers;


import com.gfa.w7d3.StudentService;
import com.gfa.w7d3.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller


public class Controller {

    @GetMapping(value = "/useful")
    public String useful() {
        return "useful";
    }

    @Autowired
    UtilityService utilityService;

    @GetMapping(value = "/useful/colored")
    public String coloredBackgroud(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored-background";
    }

    @GetMapping(value = "/useful/email")
    public String email(Model model, @RequestParam String email) {
        boolean validEmail = utilityService.isThisEmailValid(email);
        model.addAttribute("email", email);
        model.addAttribute("validEmail", validEmail);
        return "email";
    }

    @GetMapping(value = "/useful/encode")
    public String caesarEncoder(Model model, @RequestParam String text, @RequestParam int num) {
        String codedText = utilityService.caesar(text, num);
        model.addAttribute("result", codedText);
        return "caesar";
    }

    @GetMapping(value = "/useful/decode")
    public String caesarDecoder(Model model, @RequestParam String text, @RequestParam int num) {
        num *= -1;
        String decodedText = utilityService.caesar(text, num);
        model.addAttribute("result", decodedText);
        return "caesar";
    }

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/gfa")
    public String GFAHome(Model model) {
        int numOfStudents = studentService.findAll().size();
        model.addAttribute("numOfStudents", numOfStudents);
        return "gfa-home";
    }

    @GetMapping(value = "/gfa/list")
    public String listStudents(Model model) {
        List<String> list = studentService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping(value = "/gfa/add")
    public String addStudent() {
        return "add";
    }

    @GetMapping(value = "/gfa/save")
    public String saveStudent(Model model, @RequestParam String name) {
        studentService.save(name);
        List<String> list = studentService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping(value = "/gfa/check")
    public String checkStudent(Model model, String name) {
        boolean hasName = studentService.hasName(name);
        model.addAttribute("hasName", hasName);
        model.addAttribute("name", name);
        return "check";
    }


}

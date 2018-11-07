package com.gfa.w7d3.controllers;


import com.gfa.w7d3.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller




public class Controller {

    @GetMapping(value = "/useful")
    public String useful(){
        return "useful";
    }

    @Autowired
    UtilityService utilityService;

    @GetMapping(value = "/useful/colored")
    public String coloredBackgroud(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "colored-background";
    }

    @GetMapping(value = "/useful/email")
    public String email(Model model, @RequestParam String email){
        boolean validEmail = utilityService.isThisEmailValid(email);
        model.addAttribute("email", email);
        model.addAttribute("validEmail", validEmail);
        return "email";
    }


}

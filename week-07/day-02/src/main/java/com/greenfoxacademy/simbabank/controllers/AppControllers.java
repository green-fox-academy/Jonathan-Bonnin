package com.greenfoxacademy.simbabank.controllers;

import com.greenfoxacademy.simbabank.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppControllers {

    BankAccount simbasAccount = new BankAccount("Simba", 2000, "lion");

    @GetMapping(value="/show")
    public String showAccount(Model model){
        model.addAttribute("name", simbasAccount.name);
        model.addAttribute("balance", simbasAccount.formattedBalance);
        model.addAttribute("animalType", simbasAccount.animalType);
        return "show";
    }

    @GetMapping(value="/htmlception")
    @ResponseBody
    public String htmlception(){
        return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    }
}

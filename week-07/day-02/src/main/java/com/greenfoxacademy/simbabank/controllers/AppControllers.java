package com.greenfoxacademy.simbabank.controllers;

import com.greenfoxacademy.simbabank.BankAccount;
import com.greenfoxacademy.simbabank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppControllers {

    @Autowired
    BankService bankService;

    @GetMapping(value="/show")
    public String showSimba(Model model){
        model.addAttribute("name", bankService.getAccounts().get(0).name);
        model.addAttribute("balance", bankService.getAccounts().get(0).formattedBalance);
        model.addAttribute("animalType", bankService.getAccounts().get(0).animalType);
        return "show";
    }

    @PostMapping("/raise-balance")
    public String raiseBalance(@PathVariable BankAccount account){

                account.balance += 10;

        return "list-all";
    }

    @GetMapping(value="/list-all")
    public String showAllAccounts(Model model){
        model.addAttribute("accounts", bankService.getAccounts());
        return "list-all";
    }

    @GetMapping(value="/htmlception")
    @ResponseBody
    public String htmlception(){
        return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    }
}

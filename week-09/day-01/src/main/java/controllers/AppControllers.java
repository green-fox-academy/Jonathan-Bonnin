package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControllers {

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/doubling")
    public String doubles() {
        return "test";
    }
}

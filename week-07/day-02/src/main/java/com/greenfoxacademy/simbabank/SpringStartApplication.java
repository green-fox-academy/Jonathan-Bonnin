package com.greenfoxacademy.simbabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringStartApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringStartApplication.class, args);
    }

}
package com.gfa.w7d3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;


@SpringBootApplication
public class SpringApplicationStarter implements CommandLineRunner {

    @Autowired
    Printer printer;
    @Autowired
    MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationStarter.class, args);
    }


    @Override
    public void run(String...args) throws Exception {
        printer.log("Daniel rimes with miel");
        myColor.printColor();
    }
}

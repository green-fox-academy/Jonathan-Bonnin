package com.gfa.w7d3;


import org.springframework.beans.factory.annotation.Autowired;


public class Green implements MyColor {
    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("My color is green!");
    }
}

package com.gfa.w7d3;


import org.springframework.beans.factory.annotation.Autowired;

public class Blue implements MyColor {

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("Blue is blue");
    }
}

package com.gfa.w7d3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {
    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("The color is red.");
    }
}

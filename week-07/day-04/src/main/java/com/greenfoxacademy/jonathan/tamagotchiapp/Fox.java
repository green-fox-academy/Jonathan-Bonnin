package com.greenfoxacademy.jonathan.tamagotchiapp;

import java.util.List;

public class Fox {
    String name;
    List<String> tricks;
    String food;

    public String getName() {
        return name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    String drink;

    public Fox(String name) {
        this.name = name;
    }
}

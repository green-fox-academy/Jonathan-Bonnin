package com.greenfoxacademy.jonathan.tamagotchiapp;
import java.util.ArrayList;
import java.util.List;


public class Fox {
    String name;
    List<String> tricks = new ArrayList<>();
    String food;
    String drink;

    public Fox(String name) {
        this.name = name;
    }

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

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }


}

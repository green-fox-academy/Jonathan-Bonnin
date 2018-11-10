package com.greenfoxacademy.simbabank;

import java.text.DecimalFormat;

public class BankAccount {
    public String name;
    public double balance;
    public String formattedBalance;
    public String animalType;

    public BankAccount(String name, double balance, String animalType) {
        DecimalFormat df = new DecimalFormat("#.00");
        this.name = name;
        this.balance = balance;
        formattedBalance = df.format(balance);
        this.animalType = animalType;
    }
}

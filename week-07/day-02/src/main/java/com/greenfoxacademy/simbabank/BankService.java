package com.greenfoxacademy.simbabank;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {
    List<BankAccount> accounts = new ArrayList<>();

    BankService(){
        accounts.add(new BankAccount("Simba", 2000, "lion", true));
        accounts.add(new BankAccount("Timon", 1337, "meerkat", true));
        accounts.add(new BankAccount("Pumba", 9999, "warthog", true));
        accounts.add(new BankAccount("Scar", 654, "lion", false));
        accounts.add(new BankAccount("Mufasa", 5555, "lion", true));
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

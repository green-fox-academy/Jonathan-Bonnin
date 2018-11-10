package com.greenfoxacademy.simbabank;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {
    List<BankAccount> accounts = new ArrayList<>();

    BankService(){
        accounts.add(new BankAccount("Simba", 2000, "lion"));
        accounts.add(new BankAccount("Timon", 1337, "meerkat"));
        accounts.add(new BankAccount("Pumba", 9999, "warthog"));
        accounts.add(new BankAccount("Scar", 654, "lion"));
        accounts.add(new BankAccount("Simba", 5555, "lion"));
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

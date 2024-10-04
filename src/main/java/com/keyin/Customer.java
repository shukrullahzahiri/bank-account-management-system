package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String id;
    private List<BankAccount> accounts;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}

package com.keyin;

public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void applyInterest() {
        balance += balance * INTEREST_RATE;
    }
}

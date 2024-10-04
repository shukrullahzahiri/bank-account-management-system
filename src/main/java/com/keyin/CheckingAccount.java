package com.keyin;

public class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500;

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > balance + OVERDRAFT_LIMIT) {
            throw new Exception("Withdrawal exceeds overdraft limit");
        }
        balance -= amount;
    }

    @Override
    public void applyInterest() {
        // No interest for checking accounts
    }
}

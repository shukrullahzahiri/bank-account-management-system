package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new CheckingAccount("12345", 100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Deposit failed");
    }

    @Test
    public void testWithdraw() throws Exception {
        BankAccount account = new CheckingAccount("12345", 100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), "Withdraw failed");
    }

    @Test
    public void testOverdraftLimit() {
        BankAccount account = new CheckingAccount("12345", 100);
        assertThrows(Exception.class, () -> account.withdraw(700), "Overdraft limit exceeded");
    }

    @Test
    public void testNegativeDeposit() {
        BankAccount account = new CheckingAccount("12345", 100);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10), "Negative deposit not allowed");
    }
}

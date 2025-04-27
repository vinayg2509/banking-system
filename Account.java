package com.brigdgelabz.bankingsystem;



// Account class with debit method
public class Account {
    private double balance;

    // Constructor
    public Account(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
            System.out.println("Account created with "+initialBalance);
        } else {
            balance = 0;
            System.out.println("Initial balance cannot be negative or Zero.");
        }
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive or more than zero.");
        }
    }

    // Method to debit (withdraw) money from the account
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debit of Rs" + amount + " successful. New balance: Rs" + balance);
        } else {
            System.out.println("Debit amount exceeded account balance. Current balance: Rs" + balance);
        }
    }
}

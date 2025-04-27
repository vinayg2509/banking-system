package com.brigdgelabz.bankingsystem;


import java.util.Scanner;

// AccountTest class to test the debit method
 class MainAccount {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter initial Balance");
        double initialBalance =scanner.nextDouble();
        Account myAccount = new Account(initialBalance);

        // Display the current balance
        System.out.println("Initial balance: Rs" + myAccount.getBalance());

        // Test successful withdrawal
        System.out.println("Enter amount to withdraw");
        double withdrawAmount= scanner.nextDouble();
        myAccount.debit(withdrawAmount);


        // Test unsuccessful withdrawal
        System.out.println("Enter amount more that current balance to withdraw ");
        withdrawAmount= scanner.nextDouble();
        myAccount.debit(withdrawAmount);


        //Test successful deposit
        System.out.println("Enter amount to debit");
        double  debitAmount=scanner.nextDouble();
        myAccount.deposit(debitAmount);



        //Test unsuccessful deposit
        System.out.println("Enter amount negative or zero to debit");
        debitAmount=scanner.nextDouble();
        myAccount.deposit(debitAmount);


    }
}


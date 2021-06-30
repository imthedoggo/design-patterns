package com.avgu.command;

public class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double deposit) {
        balance = balance + deposit;
    }

    public void withdraw(double withdrawal) {
        balance = balance - withdrawal;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

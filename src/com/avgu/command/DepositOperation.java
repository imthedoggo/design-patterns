package com.avgu.command;

public class DepositOperation implements Operation {

    private Account account;
    private double deposit;

    public DepositOperation(Account account, double deposit) {
        this.account = account;
        this.deposit = deposit;
    }

    public void execute() {
        account.deposit(deposit);
    }
}

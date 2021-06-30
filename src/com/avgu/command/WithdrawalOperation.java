package com.avgu.command;

public class WithdrawalOperation implements Operation {

    private Account account;
    private double withdrawal;

    public WithdrawalOperation(Account account, double withdrawal) {
        this.account = account;
        this.withdrawal = withdrawal;
    }

    public void execute() {
        account.withdraw(withdrawal);
    }
}

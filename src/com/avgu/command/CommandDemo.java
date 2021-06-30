package com.avgu.command;

public class CommandDemo {

    public static void main(String[] args) {

        Account testAccount = new Account("marcus", 10000.00);
        BankProcessor processor = new BankProcessor();
        processor.executeOperation(new DepositOperation(testAccount, 500));
        processor.executeOperation(new WithdrawalOperation(testAccount, 200));
        processor.executeOperation(new DepositOperation(testAccount, 400));


        System.out.println("account holder: " + testAccount.getAccountHolder() + ", balance: "
            + testAccount.getBalance());


    }
}

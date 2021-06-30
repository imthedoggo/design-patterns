package com.avgu.command;

//invoker
public class BankProcessor {
    public void executeOperation(Operation operation) {
        operation.execute();
    }
}

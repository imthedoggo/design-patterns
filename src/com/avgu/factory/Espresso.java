package com.avgu.factory;

public class Espresso implements ICoffee {

    @Override
    public void brew() {
        System.out.println("Espresso it is.");
    }
}

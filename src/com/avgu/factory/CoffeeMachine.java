package com.avgu.factory;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        System.out.println("Which coffee would you like?");
        String coffeeType = input.nextLine();

        ICoffee coffee = CoffeeFactory.getCoffee(coffeeType);
        coffee.brew();
    }
}

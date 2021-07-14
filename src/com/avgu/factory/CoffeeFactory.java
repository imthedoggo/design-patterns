package com.avgu.factory;

//create different types of coffee objects
public class CoffeeFactory {

    public static ICoffee getCoffee(String coffeeType) throws Exception {

        switch (coffeeType) {
            case "espresso":
                return new Espresso();
            case "flat white":
                return new FlatWhite();
            default:
                throw new ClassNotFoundException("We don't make those here");
        }
    }
}

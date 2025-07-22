package com.example.mvcback.model;

// import factory.Beverage;

public class Coffee extends Beverage {
    public Coffee() {
        description = "Coffee";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}




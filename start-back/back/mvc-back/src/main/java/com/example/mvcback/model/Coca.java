package com.example.mvcback.model;


public class Coca extends Beverage {
    public Coca() {
        description = "Coca";
    }

    @Override
    public double getCost() {
        return 8.0;
    }
}

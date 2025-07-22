package com.example.mvcback.model;

public abstract class Beverage {
    protected String description = "Unknown factory.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}

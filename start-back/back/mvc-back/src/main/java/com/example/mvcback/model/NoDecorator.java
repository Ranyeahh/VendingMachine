package com.example.mvcback.model;



public class NoDecorator extends Decorator {
    private String description = "No factory.Decorator";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return 0.0;
    }
}

package com.example.mvcback.model;

public class IceDecorator extends Decorator {
    private Beverage beverage;

    public IceDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Ice";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.5;
    }
}

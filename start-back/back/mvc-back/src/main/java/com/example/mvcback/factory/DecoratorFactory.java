package com.example.mvcback.factory;

import com.example.mvcback.model.Beverage;
import com.example.mvcback.model.IceDecorator;
import com.example.mvcback.model.MilkDecorator;


public class DecoratorFactory {
    private String decorator;

    public DecoratorFactory(String decorator) {
        this.decorator = decorator;
    }

    public Beverage getDecorator(Beverage beverage) {
        if (decorator.equalsIgnoreCase("milk")) {
            return new MilkDecorator(beverage);
        } else if (decorator.equalsIgnoreCase("ice")) {
            return new IceDecorator(beverage);
        } else {
            return beverage; // 不加装饰
        }
    }
}
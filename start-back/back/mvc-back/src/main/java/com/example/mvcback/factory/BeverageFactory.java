package com.example.mvcback.factory;

import com.example.mvcback.model.Beverage;
import com.example.mvcback.model.Coca;
import com.example.mvcback.model.Coffee;

public class BeverageFactory {
    private String beverageName;

    public BeverageFactory(String beverageName) {
        this.beverageName = beverageName;
    }

    public Beverage getBeverage() {
        if (beverageName.equalsIgnoreCase("coffee")) {
            return new Coffee();
        } else if (beverageName.equalsIgnoreCase("coca")) {
            return new Coca();
        }
        else {
            throw new IllegalArgumentException("Unknown beverage: " + beverageName);
        }
    }
}
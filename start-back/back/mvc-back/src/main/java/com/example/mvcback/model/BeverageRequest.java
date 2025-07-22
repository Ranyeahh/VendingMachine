package com.example.mvcback.model;

import java.util.List;

public class BeverageRequest {
    private String type;
    private List<String> decorators;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<String> decorators) {
        this.decorators = decorators;
    }
}

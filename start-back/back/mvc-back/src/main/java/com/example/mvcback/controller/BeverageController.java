package com.example.mvcback.controller;

import com.example.mvcback.factory.BeverageFactory;
import com.example.mvcback.factory.DecoratorFactory;
import com.example.mvcback.model.BeverageRequest;
import com.example.mvcback.model.Beverage ;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/beverage")
public class BeverageController {


    @GetMapping("/")
    public String index() {
        return "后端运行成功，你可以访问 /api/beverages 获取饮料列表";
    }


    @GetMapping
    public List<String> getBeverages() {
        return List.of("Coca", "Coffee", "Milk");
    }



    @PostMapping("/make")
    public ResponseEntity<Map<String, Object>> makeBeverage(@RequestBody BeverageRequest request) {
        Beverage beverage = new BeverageFactory(request.getType()).getBeverage();
        for (String decorator : request.getDecorators()) {
            beverage = new DecoratorFactory(decorator).getDecorator(beverage);
        }

        Map<String, Object> response = new HashMap<>();
        response.put("description", beverage.getDescription());
        response.put("price", beverage.getCost());
        return ResponseEntity.ok(response);
    }
}


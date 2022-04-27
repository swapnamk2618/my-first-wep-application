package com.dlithe.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyShoppingCart {

    @GetMapping("fetch-flower-details/{flowerName}")
    public String varietyOfFlowerDetails(@PathVariable String flowerName) {
        switch (flowerName) {
            case "rose":
                return roseDetails();
            case "sunflower":
                return sunflowerDetails();
            case "hibiscus":
                return hibiscusDetails();
            case "lily":
                return lilyDetails();
            default:
                return "no product found";
        }

    }

    public String roseDetails() {
        return "Welcome variety of rose available";
    }

    public String sunflowerDetails() {
        return "Welcome variety of sunflower available";
    }

    public String hibiscusDetails() {
        return "Welcome variety of hibiscus available";
    }

    public String lilyDetails() {
        return "Welcome variety of lily available";
    }
}

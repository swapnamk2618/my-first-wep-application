package com.dlithe.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String myFirstMethod() {
        return "Hey welcome to java swapna";
    }

    @GetMapping("add/{numOne}/{numTwo}")
    public int division(@PathVariable int numOne, @PathVariable int numTwo) {
        try {
            return numOne + numTwo;
        } catch (NumberFormatException ex) {
            throw new NullPointerException("number and string not added");
        }
    }

    @GetMapping("fetch-product-details/{productName}")
    public String shoppingCart(@PathVariable String productName) {
        switch (productName) {
            case "laptops":
                return laptopDetails();
            case "mobile":
                return mobileDetails();
            case "flower":
                return flowerDetails();
            default:
                return "no product found";
        }


    }

    public String laptopDetails() {
        return "laptops availabes best rates starting from 10000-50000";
    }

    public String mobileDetails() {
        return "mobile available best price";
    }

    public String flowerDetails() {
        return "welcome to fresh flower available";
    }

}

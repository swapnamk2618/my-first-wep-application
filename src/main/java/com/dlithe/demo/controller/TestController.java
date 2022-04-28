package com.dlithe.demo.controller;

import com.dlithe.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

   @GetMapping("get-product-details/{productName}")
    public String myShopCart(@PathVariable String productName){
     String result= testService.getProductDetails(productName);
       return result;
   }
}

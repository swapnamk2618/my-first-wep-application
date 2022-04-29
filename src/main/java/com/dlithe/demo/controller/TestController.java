package com.dlithe.demo.controller;

import com.dlithe.demo.dto.ProductDetailsRequest;
import com.dlithe.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

   @GetMapping("get-product-details/{productName}")
    public String displayProductDetail(@PathVariable String productName){
 return testService.fetchProductDetails(productName);
   }

    @PostMapping("get-product-details")
    public String displayProductDetails(@RequestBody ProductDetailsRequest productDetailsRequest){
        return testService.registerProduct(productDetailsRequest);
    }

    @GetMapping("login/{username}/{password}")
    public String loginDetails(@PathVariable String username, @PathVariable String password) {
//        return "Username is: "+username+" "+"Password is: "+password;
        return testService.loginDetails(username, password);

    }


}

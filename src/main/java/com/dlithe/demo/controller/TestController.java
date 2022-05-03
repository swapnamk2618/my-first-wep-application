package com.dlithe.demo.controller;

import com.dlithe.demo.dto.ProductDetailsRequest;
import com.dlithe.demo.dto.ProductDetailsResponse;
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

//    @PostMapping("get-product-details")
//    public String displayProductDetails(@RequestBody ProductDetailsRequest productDetailsRequest){
//        return testService.registerProduct(productDetailsRequest);
//    }

    //Product details based on  product id
    @GetMapping("get-customer-details/{productId}")
    public ProductDetailsResponse fetchDetails(@PathVariable int productId){
        return testService.fetchProductDetails(productId);
    }

    @GetMapping("login/{username}/{password}")
    public String loginDetails(@PathVariable String username, @PathVariable String password) {
        return testService.loginDetails(username, password);

    }



    //product details with one feedback
    @GetMapping("get-product-details-feedback/{productId}")
    public ProductDetailsResponse fetchProductFeedback(@PathVariable int productId){
        return testService.fetchProductDetail(productId);
    }


    //list of feedbacks
    @GetMapping("get-product-details/{productId}")
    public ProductDetailsResponse getAllFeedback(@PathVariable int productId){
    return testService.getProductAllFeedback(productId);
    }

}

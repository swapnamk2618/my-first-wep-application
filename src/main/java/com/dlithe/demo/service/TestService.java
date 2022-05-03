package com.dlithe.demo.service;

import com.dlithe.demo.dto.ProductDetailsRequest;
import com.dlithe.demo.dto.ProductDetailsResponse;
import org.springframework.stereotype.Component;

@Component//used to work the class/interface
public interface TestService {
    String fetchProductDetails(String productName);
    //post
//    String registerProduct(ProductDetailsRequest productDetailsRequest);

    //get
    String loginDetails(String username, String password);


    ProductDetailsResponse fetchProductDetails(int productId);


    ProductDetailsResponse fetchProductDetail(int productId);

    // list of feedbacks
    ProductDetailsResponse getProductAllFeedback(int customerId);

}

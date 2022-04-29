package com.dlithe.demo.service;

import com.dlithe.demo.dto.ProductDetailsRequest;
import org.springframework.stereotype.Component;

@Component//used to work the class/interface
public interface TestService {
    String fetchProductDetails(String productName);
    String registerProduct(ProductDetailsRequest productDetailsRequest);
    String loginDetails(String username, String password);
}

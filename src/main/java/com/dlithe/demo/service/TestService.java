package com.dlithe.demo.service;

import org.springframework.stereotype.Component;

@Component//used to work the class/interface
public interface TestService {
    String getProductDetails(String productName);
}

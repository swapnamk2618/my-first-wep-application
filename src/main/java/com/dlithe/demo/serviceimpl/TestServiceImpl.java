package com.dlithe.demo.serviceimpl;

import com.dlithe.demo.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService  {

    @Override
    public java.lang.String getProductDetails(java.lang.String productName) {
        if(productName!=null){
            switch(productName){
                case "laptop":
                    return "product available best price";
                case "mobile":
                    return "low quality product";
                default:
                    return "no product found";

            }
        }else{
            return "product not null";
        }
    }
}

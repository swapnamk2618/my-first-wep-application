package com.dlithe.demo.serviceimpl;

import com.dlithe.demo.dto.ProductDetailsRequest;
import com.dlithe.demo.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService  {

    @Override
    public String fetchProductDetails(String productName) {
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

    @Override
    public String registerProduct(ProductDetailsRequest productDetailsRequest) {
        System.out.println(productDetailsRequest);
        return null;
    }

    @Override
    public String loginDetails(String username, String password) {
        if(username!= null && password!=null){
            return  "Username: "+username+" "+"Password: "+password;
        }
        else {
            return "No values to return";
        }
    }


}

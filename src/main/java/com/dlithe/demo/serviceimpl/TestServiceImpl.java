package com.dlithe.demo.serviceimpl;

import com.dlithe.demo.dto.ProductDetailsRequest;
import com.dlithe.demo.dto.ProductDetailsResponse;
import com.dlithe.demo.entity.Product;
import com.dlithe.demo.repository.ProductDAO;
import com.dlithe.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService  {

    @Autowired
    private ProductDAO productDAO;

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

//    @Override
//    public String registerProduct(ProductDetailsRequest productDetailsRequest) {
//        System.out.println(productDetailsRequest);
//        return null;
//    }

    @Override
    public String loginDetails(String username, String password) {
        if(username!= null && password!=null){
            return  "Username: "+username+" "+"Password: "+password;
        }
        else {
            return "No values to return";
        }
    }





    @Override
    public String registerProduct(ProductDetailsRequest productDetailsRequest) {
        Product product=new Product();
        product.setName(productDetailsRequest.getName());
        product.setPrice(productDetailsRequest.getPrice());
        product.setType(productDetailsRequest.getType());
        product.setDetails(productDetailsRequest.getDetails());
        productDAO.save(product);

        return "product details save sucessfully";
    }

}

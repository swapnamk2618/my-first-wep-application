package com.dlithe.demo.serviceimpl;

import com.dlithe.demo.dto.ProductDetailsRequest;
import com.dlithe.demo.dto.ProductDetailsResponse;
import com.dlithe.demo.dto.ProductFeedback;
import com.dlithe.demo.entity.Product;
import com.dlithe.demo.repository.ProductDAO;
import com.dlithe.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "laptop":
                    return "product available best price";
                case "mobile":
                    return "low quality product";
                default:
                    return "no product found";
            }
        } else {
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
        if (username != null && password != null) {
            return "Username: " + username + " " + "Password: " + password;
        } else {
            return "No values to return";
        }
    }


    @Override
    public ProductDetailsResponse fetchProductDetail(int productId) {

        Optional<Product> product = productDAO.findById(productId);
        if (!product.isPresent()) {
            throw new NullPointerException("the product not found!!");
        }
        Product productFromDatabase = product.get();

        ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
        productDetailsResponse.setId(productFromDatabase.getId());
        productDetailsResponse.setName(productFromDatabase.getName());
        productDetailsResponse.setRating(productFromDatabase.getRating());

        return productDetailsResponse;

    }

    //list
    @Override
    public ProductDetailsResponse getProductAllFeedback(int productId) {

        List<ProductFeedback> feedbacks = new ArrayList<>();
        Optional<Product> product = productDAO.findById(productId);

        Product productFromDatabase = product.get();

        ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
        productDetailsResponse.setId(productDetailsResponse.getId());
        productDetailsResponse.setName(productDetailsResponse.getName());
        productDetailsResponse.setRating(productDetailsResponse.getRating());

        ProductFeedback productFeedback = new ProductFeedback();
        productFeedback.setNameOfProduct("mobile");
        productFeedback.setFeedbackMessage("worst mobile ever seen");
        productFeedback.setRatings(4);

        feedbacks.add(productFeedback);

        ProductFeedback productFeedback1 = new ProductFeedback();
        productFeedback1.setNameOfProduct("lap");
        productFeedback1.setFeedbackMessage("good");
        productFeedback1.setRatings(4);

        feedbacks.add(productFeedback);

        //feedback to product
        productDetailsResponse.setFeedbacks(feedbacks);


        return productDetailsResponse;
    }


    //feedback
    @Override
    public ProductDetailsResponse fetchProductDetails(int productId) {
        Optional<Product> product = productDAO.findById(productId);
        Product productFromDatabase = product.get();

        ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
        productDetailsResponse.setId(productFromDatabase.getId());
        productDetailsResponse.setName(productFromDatabase.getName());
        productDetailsResponse.setRating(productFromDatabase.getRating());
        ;
        ProductFeedback feedbackResponse = new ProductFeedback();
        feedbackResponse.setNameOfProduct("Laptop");
        feedbackResponse.setFeedbackMessage("bad Service");
        feedbackResponse.setRatings(1);

        productDetailsResponse.setFeedback(feedbackResponse);

        return productDetailsResponse;
    }


//    @Override
//    public String registerProduct(ProductDetailsRequest productDetailsRequest) {
//        Product product = new Product();
//        product.setName(productDetailsRequest.getName());
//        product.setPrice(productDetailsRequest.getPrice());
//        product.setType(productDetailsRequest.getType());
//        product.setDetails(productDetailsRequest.getDetails());
//        productDAO.save(product);
//
//        return "product details save sucessfully";
//    }


}

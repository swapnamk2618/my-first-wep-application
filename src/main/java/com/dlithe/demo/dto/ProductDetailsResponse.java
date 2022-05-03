package com.dlithe.demo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProductDetailsResponse {

    private int id;
    private String name;
    private double rating;

    private ProductFeedback feedback;


    private List<ProductFeedback> feedbacks;
}

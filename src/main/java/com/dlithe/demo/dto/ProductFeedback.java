package com.dlithe.demo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProductFeedback {
//    private int productId;
    private String nameOfProduct;
    private String feedbackMessage;
    private int ratings;
}

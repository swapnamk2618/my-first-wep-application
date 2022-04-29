package com.dlithe.demo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ProductDetailsRequest {
    private String productName;
    private String productType;
    private String productDetails;
    private String productLocation;
}

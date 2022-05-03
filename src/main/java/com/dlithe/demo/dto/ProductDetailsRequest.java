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
    private String name;
    private String type;
    private int price;
    private String details;
}

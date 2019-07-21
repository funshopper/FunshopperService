package com.funshopper.service.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Product {
    private Long id;
    private String name;
    private Double price;
    private String pictureUrl;
}
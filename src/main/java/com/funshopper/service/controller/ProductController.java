package com.funshopper.service.controller;

import com.funshopper.service.model.Product;
import com.funshopper.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"", "/"})
    public @NotNull Iterable<Product> getProducts() {
        String name = null;
        if (name != null) {
            System.out.println("name = " + name);
        }
        return productService.getProducts();
    }
}

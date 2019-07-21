package com.funshopper.service.service;

import com.funshopper.service.fallback.ProductFallback;
import com.funshopper.service.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "${feign.name}", url = "${feign.url}", fallback = ProductFallback.class)
public interface ProductService {
    @GetMapping(value = "/products")
    List<Product> getProducts();
}

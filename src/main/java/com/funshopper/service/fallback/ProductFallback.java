package com.funshopper.service.fallback;

import com.funshopper.service.model.Product;
import com.funshopper.service.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductFallback implements ProductService {

    public List<Product> getProducts() {
        return null;
    }
}

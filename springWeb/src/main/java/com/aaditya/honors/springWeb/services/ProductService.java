package com.aaditya.honors.springWeb.services;

import com.aaditya.honors.springWeb.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    private List<Product> products = Arrays.asList(new Product("Laptop", 850), new Product("Mobile", 999));
    @GetMapping("/products")
    public List<Product> getProducts(){
        return products;
    }
}

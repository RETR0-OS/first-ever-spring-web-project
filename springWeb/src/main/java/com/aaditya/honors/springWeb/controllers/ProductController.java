package com.aaditya.honors.springWeb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aaditya.honors.springWeb.services.ProductService;
import com.aaditya.honors.springWeb.models.Product;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductByID(id);
    }

    @PostMapping("/add/new")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product added successfully";
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product){
        productService.updateProduct(id, product);
        return "Product updated successfully";
    }
}

package com.aaditya.honors.springWeb.services;

import com.aaditya.honors.springWeb.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

@Service
public class ProductService {
    private ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product("Laptop", 850), new Product("Mobile", 999)));
    @GetMapping("/products")
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductByID(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, Product product) {
        Product target_prod = getProductByID(id);
        target_prod.setName(product.getName());
        target_prod.setPrice(product.getPrice());
    }
}

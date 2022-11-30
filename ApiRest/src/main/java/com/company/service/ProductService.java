package com.company.service;

import com.company.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
}

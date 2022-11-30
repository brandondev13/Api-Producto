package com.company.service;

import com.company.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{


    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "Iphone", 1950));
        products.add(new Product(2l, "Pc", 2100));
        products.add(new Product(3l, "Celular", 900));
        return products;
    }




}

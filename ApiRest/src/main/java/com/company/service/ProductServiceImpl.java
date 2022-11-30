package com.company.service;

import com.company.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{

    List<Product> products = new ArrayList<>();

    public ProductServiceImpl() {
        products.add(new Product(1l, "Iphone", 1950));
        products.add(new Product(2l, "Pc", 2100));
        products.add(new Product(3l, "Celular", 900));
    }
    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProduct(Long id) {
        Iterator<Product> iterator = getProducts().iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(id)) {
                return product;
            }
        }

        return null;
    }

    @Override
    public void createProduct(Long productId, String productName, Integer price) {
        products.add(new Product(productId, productName, price));
    }


}

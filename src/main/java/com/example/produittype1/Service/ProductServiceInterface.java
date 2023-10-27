package com.example.produittype1.Service;

import com.example.produittype1.Entity.Product;

import java.util.List;

public interface ProductServiceInterface {


    Product create(Product product);

    Product getById(Long id);

    List<Product> getList();

    List<Product> getProductByType(Long id);
}

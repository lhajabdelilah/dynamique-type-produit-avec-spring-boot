package com.example.produittype1.Repository;


import com.example.produittype1.Entity.Product;
import com.example.produittype1.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findProductById(Long id);
    public List<Product> findAllByProductType(ProductType productType);
}

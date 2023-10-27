package com.example.produittype1.Repository;

import com.example.produittype1.Entity.ProductAttribute;
import com.example.produittype1.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Long> {
    List<ProductAttribute> findByProductType(ProductType productType);
}

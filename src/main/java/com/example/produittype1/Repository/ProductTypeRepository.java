package com.example.produittype1.Repository;



import com.example.produittype1.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
    public ProductType findProductTypeById(Long id);
}

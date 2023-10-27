package com.example.produittype1.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "productType")
    private List<ProductAttribute> productAttributes;

    @OneToMany(mappedBy = "productType")
    private List<Product> products;
    // Other common attributes

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
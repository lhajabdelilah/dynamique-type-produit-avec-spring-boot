package com.example.produittype1.Entity;

import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double prix;
    private String description;
    private String nom;

    // Add this field for the attribute map
    @ElementCollection
    @CollectionTable(name = "produit_attributes", joinColumns = @JoinColumn(name = "produit_id"))
    @MapKeyColumn(name = "attribute_name")
    @Column(name = "attribute_value")
    private Map<String, String> attributes = new HashMap<>();

    @ManyToOne
    private TypeProduit typeProduit;

    public Produit() {
    }

    public Produit(Long id, double prix, String description, TypeProduit typeProduit, String nom) {
        this.id = id;
        this.prix = prix;
        this.description = description;
        this.typeProduit = typeProduit;
        this.nom = nom;
    }

    // Getters and setters for attributes

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}

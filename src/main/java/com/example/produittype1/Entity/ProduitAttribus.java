package com.example.produittype1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class ProduitAttribus  {
    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_produit_id") // This specifies the name of the foreign key column
    private TypeProduit typeProduit; // Represents the many-to-one relationship

    // Constructors, getters, and setters
}

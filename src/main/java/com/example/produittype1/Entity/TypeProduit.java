package com.example.produittype1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List; // Importez la classe java.util.List
@Setter
@Getter
@Entity
public class TypeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ElementCollection
    private List<String> stringList = new ArrayList<>();

    public TypeProduit(String name, String description, List<String> stringList) {
        this.name = name;
        this.description = description;
        this.stringList = stringList;
    }

    public TypeProduit() {

    }
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_Produit_id",referencedColumnName = "id")
    private List<Produit> produits;
}

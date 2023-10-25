package com.example.produittype1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Setter
@Getter

@Entity
public class Produit  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long id ;
    private  String name ;
    @ElementCollection
    private Map<String, String> attributes = new HashMap<>();

    public Produit(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public Produit() {

    }



}

package com.example.produittype1.Service;

import com.example.produittype1.Entity.TypeProduit;

import java.util.List;

public interface ServiceTypeProduit {
    TypeProduit createTypeProduit(TypeProduit t);
    List<TypeProduit> afficherallTypes();
    TypeProduit getTypeProduitById(Long id);


}

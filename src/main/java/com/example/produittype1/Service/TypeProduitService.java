package com.example.produittype1.Service;

import com.example.produittype1.Entity.TypeProduit;

import java.util.List;

public interface TypeProduitService {
    TypeProduit createTypeProduit(TypeProduit p);
    TypeProduit getTypeProduitById(Long tp);

    List<TypeProduit> getAllTypeProduit();
}

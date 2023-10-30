package com.example.produittype1.Service;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;

import java.util.List;

public interface ProduitService {
    Produit create(Produit p) ;
    Produit getProduit(Long id);
    List<Produit> getAllProduit() ;
    List<Produit> findAllByTypeProduit(TypeProduit typeProduit);
    List<Produit> findAllByTypeProduit_Id(Long id);


}

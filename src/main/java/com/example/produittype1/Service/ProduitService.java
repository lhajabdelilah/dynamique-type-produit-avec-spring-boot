package com.example.produittype1.Service;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;

import java.lang.reflect.Type;
import java.util.List;

public interface ProduitService {
Produit create(Produit p );
List<Produit> getProductsByType(TypeProduit typeProduit);

}

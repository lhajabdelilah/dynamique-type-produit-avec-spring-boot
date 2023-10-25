package com.example.produittype1.Service;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Repository.ProduitRepository;
import com.example.produittype1.Repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduitImplimentation implements  ProduitService {
    @Autowired
    ProduitRepository produitRepository ;
    @Autowired
    TypeProduitRepository typeProduitRepository;
    @Override
    public Produit create(Produit p) {
        produitRepository.save(p);
        return p;
    }

    public List<Produit> getProductsByType(TypeProduit typeProduit) {
        return produitRepository.findByCategory(typeProduit);
    }
}

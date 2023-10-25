package com.example.produittype1.Service;


import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeProduitImplimentation implements  ServiceTypeProduit {
    @Autowired
    TypeProduitRepository typeProduitRepository;
    @Override
    public TypeProduit createTypeProduit(TypeProduit t) {
        typeProduitRepository.save(t);
        return t;
    }

    @Override
    public List<TypeProduit> afficherallTypes() {
        return typeProduitRepository.findAll();
    }

    @Override
    public TypeProduit getTypeProduitById(Long id) {
        return typeProduitRepository.findById(id).get();
    }
}

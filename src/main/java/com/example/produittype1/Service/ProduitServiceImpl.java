package com.example.produittype1.Service;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitServiceImpl implements  ProduitService{
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit create(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> findAllByTypeProduit(TypeProduit typeProduit) {
        return produitRepository.findAllByTypeProduit(typeProduit);
    }

    @Override
    public List<Produit> findAllByTypeProduit_Id(Long id) {
        return produitRepository.findAllByTypeProduit_Id(id);
    }


}

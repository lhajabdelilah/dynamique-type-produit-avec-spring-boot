package com.example.produittype1.Service;

import com.example.produittype1.Entity.ProduitAttribus;
import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Repository.ProduitAttribusRepository;
import com.example.produittype1.Repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitAttribusServiceIml implements ProduitAttribusService {
    @Autowired
    private ProduitAttribusRepository produitAttribusRepository;
    @Override
    public List<ProduitAttribus> saveListProduitAttribus(List<ProduitAttribus> list) {
        for (ProduitAttribus produitAttribus : list) {
            // Save each ProduitAttribus
         produitAttribusRepository.save(produitAttribus);
        }
        return list;
    }
}

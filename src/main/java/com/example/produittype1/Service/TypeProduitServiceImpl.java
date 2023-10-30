package com.example.produittype1.Service;

import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeProduitServiceImpl implements TypeProduitService {
   @Autowired
    TypeProduitRepository typeProduitRepository;
    @Override
    public TypeProduit createTypeProduit(TypeProduit p) {
        return typeProduitRepository.save(p);
    }

    @Override
    public TypeProduit getTypeProduitById(Long tp) {
        return typeProduitRepository.findById(tp).get();
    }



    @Override
    public List<TypeProduit> getAllTypeProduit() {
        return typeProduitRepository.findAll();
    }
}

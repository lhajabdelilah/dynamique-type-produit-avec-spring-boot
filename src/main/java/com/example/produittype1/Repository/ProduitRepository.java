package com.example.produittype1.Repository;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    List<Produit> findByCategory(TypeProduit typeProduit);
}

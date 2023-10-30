package com.example.produittype1.Repository;

import com.example.produittype1.Entity.Produit;
import com.example.produittype1.Entity.TypeProduit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    List<Produit> findAllByTypeProduit(TypeProduit typeProduit);
    List<Produit> findAllByTypeProduit_Id(Long id);
}

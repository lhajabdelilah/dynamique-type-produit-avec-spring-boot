package com.example.produittype1.Repository;


import com.example.produittype1.Entity.TypeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit,Long> {
}

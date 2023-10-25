package com.example.produittype1.Controller;

import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Service.ServiceTypeProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/TypeProduit")
@RestController
public class TypeProduitcontroller {
   @Autowired
    ServiceTypeProduit serviceTypeProduit ;
   @PostMapping("/create")
   public TypeProduit  addTypeProduit(@RequestBody TypeProduit typeProduit){
       return  serviceTypeProduit.createTypeProduit(typeProduit);
   }
   @GetMapping("/getallTypeProduit")
   public List<TypeProduit> getAll(){
       return  serviceTypeProduit.afficherallTypes();
   }

}

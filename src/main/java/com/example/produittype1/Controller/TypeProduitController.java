package com.example.produittype1.Controller;

import com.example.produittype1.Entity.TypeProduit;
import com.example.produittype1.Service.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/typeproduit")
public class TypeProduitController {
    @Autowired
  private   TypeProduitService typeProduitService;
    @PostMapping("/add")
    public TypeProduit addTypeProduit(@RequestBody TypeProduit Tp){
        TypeProduit dd = typeProduitService.createTypeProduit(Tp);
        return dd ;
    }
    @GetMapping("/all")
    public List<TypeProduit> getAllTypeProduit(){
        return typeProduitService.getAllTypeProduit();
    }
    @GetMapping("/get/{id}")
    public TypeProduit getTypeProduitById(@PathVariable Long id){
        return typeProduitService.getTypeProduitById(id);
    }



}

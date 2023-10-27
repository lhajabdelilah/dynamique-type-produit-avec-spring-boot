package com.example.produittype1.Controller;


import com.example.produittype1.Entity.Product;
import com.example.produittype1.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/get/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @GetMapping("/all")
    public List<Product> getList() {
        return productService.getList();
    }

    @GetMapping("/type/{id}")
    public List<Product> getProductByType(@PathVariable Long id) {
        return productService.getProductByType(id);
    }
}


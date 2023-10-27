package com.example.produittype1.Service;

import com.example.produittype1.Entity.Product;
import com.example.produittype1.Entity.ProductType;
import com.example.produittype1.Repository.ProductRepository;
import com.example.produittype1.Repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements  ProductServiceInterface {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    public Product create(Product product){
        return productRepository.save(product);
    }

    public Product getById(Long id){
        return  productRepository.findProductById(id);
    }

    public List<Product> getList(){
        return productRepository.findAll();
    }

    public List<Product> getProductByType(Long id){
        ProductType productType = productTypeRepository.findProductTypeById(id);
        return  productRepository.findAllByProductType(productType);
    }
}

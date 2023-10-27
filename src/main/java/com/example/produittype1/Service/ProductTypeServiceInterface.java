package com.example.produittype1.Service;

import com.example.produittype1.Entity.ProductAttribute;
import com.example.produittype1.Entity.ProductType;

import java.util.List;

public interface ProductTypeServiceInterface {


    ProductType createProductType(ProductType productType);

    List<ProductType> getAllProductTypes();

    List<ProductAttribute> getAttributesForProductType(Long productTypeId);

    ProductAttribute addAttributeToProductType(Long productTypeId, String attributeName);
}

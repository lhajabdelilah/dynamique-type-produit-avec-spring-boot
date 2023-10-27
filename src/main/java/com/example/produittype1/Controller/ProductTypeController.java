package com.example.produittype1.Controller;


import com.example.produittype1.Entity.ProductAttribute;
import com.example.produittype1.Entity.ProductType;
import com.example.produittype1.Service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/product-types")
@CrossOrigin
public class ProductTypeController {
    private final ProductTypeService productTypeService;

    @Autowired
    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    @PostMapping
    public ProductType createProductType(@RequestBody ProductType productType) {
        return productTypeService.createProductType(productType);
    }

    @GetMapping
    public List<ProductType> getAllProductTypes() {
        return productTypeService.getAllProductTypes();
    }

    @GetMapping("/{productTypeId}/attributes")
    public List<ProductAttribute> getAttributesForProductType(@PathVariable Long productTypeId) {
        return productTypeService.getAttributesForProductType(productTypeId);
    }

    @PostMapping("/{productTypeId}/add-attribute")
    public ProductAttribute addAttributeToProductType(
            @PathVariable Long productTypeId,
            @RequestBody AttributeRequest attributeRequest
    ) {
        return productTypeService.addAttributeToProductType(productTypeId, attributeRequest.getAttributeName());
    }

    static class AttributeRequest {
        private String attributeName;

        public String getAttributeName() {
            return attributeName;
        }

        public void setAttributeName(String attributeName) {
            this.attributeName = attributeName;
        }

    }
}

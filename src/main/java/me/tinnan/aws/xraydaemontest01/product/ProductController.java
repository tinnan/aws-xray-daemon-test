package me.tinnan.aws.xraydaemontest01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public ProductResponse getProduct(@PathVariable int id) {
        Product p = productService.getProductById(id);
        ProductResponse product = new ProductResponse();
        product.setId(p.getId());
        product.setName(p.getName());
        product.setUnitPrice(p.getUnitPrice());
        return product;
    }
}

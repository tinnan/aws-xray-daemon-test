package me.tinnan.aws.xraydaemontest.feature01;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {

    public Product getProductById(int id) {

        Product product = new Product();
        product.setId(id);
        product.setName("Toy " + id);
        product.setUnitPrice(new BigDecimal(100.00 + (10.00 * id)));
        product.setDescLine1("Toy [" + id + "] description line 1.");
        product.setDescLine1("Toy [" + id + "] description line 2.");
        return product;
    }
}

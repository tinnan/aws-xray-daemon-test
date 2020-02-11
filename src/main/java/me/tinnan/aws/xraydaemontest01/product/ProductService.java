package me.tinnan.aws.xraydaemontest01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public Product getProductById(int id) {
        Optional<Product> it = productRepo.findById(id);
        if (it.isPresent()) {
            return it.get();
        }

        Product product = new Product();
        product.setId(id);
        product.setName("Toy " + id);
        product.setUnitPrice(new BigDecimal(100.00 + (10.00 * id)));
        product.setDescLine1("Toy [" + id + "] description line 1.");
        product.setDescLine1("Toy [" + id + "] description line 2.");
        productRepo.save(product);

        return product;
    }
}

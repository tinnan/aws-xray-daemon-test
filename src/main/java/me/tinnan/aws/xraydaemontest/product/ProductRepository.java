package me.tinnan.aws.xraydaemontest.product;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Table;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

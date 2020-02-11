package me.tinnan.aws.xraydaemontest01.product;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "unitPrice")
    private BigDecimal unitPrice;
    @Column(name = "descLine1")
    private String descLine1;
    @Column(name = "descLine2")
    private String descLine2;

}

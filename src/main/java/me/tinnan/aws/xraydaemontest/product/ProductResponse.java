package me.tinnan.aws.xraydaemontest.product;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponse {
    private int id;
    private String name;
    private BigDecimal unitPrice;
}

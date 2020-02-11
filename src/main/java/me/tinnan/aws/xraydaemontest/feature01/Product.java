package me.tinnan.aws.xraydaemontest.feature01;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal unitPrice;
    private String descLine1;
    private String descLine2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescLine1() {
        return descLine1;
    }

    public void setDescLine1(String descLine1) {
        this.descLine1 = descLine1;
    }

    public String getDescLine2() {
        return descLine2;
    }

    public void setDescLine2(String descLine2) {
        this.descLine2 = descLine2;
    }
}

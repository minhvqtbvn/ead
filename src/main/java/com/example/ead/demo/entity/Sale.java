package com.example.ead.demo.entity;


import javax.persistence.*;

@Entity
public class Sale {
    @Id
    private long S1No;
    private int SalesmanID;
    private long ProdID;
    private String SalesmanName;
    private long Dos;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getS1No() {
        return S1No;
    }

    public void setS1No(long s1No) {
        S1No = s1No;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }

    public long getProdID() {
        return ProdID;
    }

    public void setProdID(long prodID) {
        ProdID = prodID;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public long getDos() {
        return Dos;
    }

    public void setDos(long dos) {
        Dos = dos;
    }
}

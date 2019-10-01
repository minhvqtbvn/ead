package com.example.ead.demo.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private long ProdID;
    private String ProdName ;
    private String Description;
    private long DateOfManf;

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    private double Price;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private Sale sale;
    public long getProdID() {
        return ProdID;
    }

    public void setProdID(long prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public long getDateOfManf() {
        return DateOfManf;
    }

    public void setDateOfManf(long dateOfManf) {
        DateOfManf = dateOfManf;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}

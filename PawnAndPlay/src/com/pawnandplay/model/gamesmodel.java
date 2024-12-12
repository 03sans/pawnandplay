/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pawnandplay.model;

/**
 *
 * @author sanskritia
 */
public class gamesmodel {
    private int productID;
    private String productname;
    private double price;
    private int stock;

    public gamesmodel() {
    }

    public gamesmodel(int productID, String productname, double price, int stock) {
        this.productID = productID;
        this.productname = productname;
        this.price = price;
        this.stock = stock;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductname() {
        return productname;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    } 
}

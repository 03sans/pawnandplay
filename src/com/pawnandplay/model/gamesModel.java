/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pawnandplay.model;

/**
 *
 * @author sanskritia
 */
public class gamesModel {
    private int ID;
    private String productname;
    private String level;
    private String genre;
    private int age;
    private double price;
    private int stock;
    private String brand;

    public gamesModel() {
    }

    public gamesModel(int ID, String productname, String level, String genre, int age, double price, int stock, String brand) {
        this.ID = ID;
        this.productname = productname;
        this.level = level;
        this.genre = genre;
        this.age = age;
        this.price = price;
        this.stock = stock;
        this.brand = brand;
    }

    public int getID() {
        return ID;
    }

    public String getProductname() {
        return productname;
    }

    public String getLevel() {
        return level;
    }

    public String getGenre() {
        return genre;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

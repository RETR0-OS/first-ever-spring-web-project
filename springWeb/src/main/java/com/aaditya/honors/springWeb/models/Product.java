package com.aaditya.honors.springWeb.models;

public class Product {
    private String name;
    private double price;
    private int id;
    private static int lastId = -1;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = ++lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

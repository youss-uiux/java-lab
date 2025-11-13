package com.javalab.demos.lombokdemo.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Modèle Product démontrant les annotations Lombok
 */
@Getter
@Setter
@ToString
public class Product {
    private String name;
    private double price;
    private String category;
    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

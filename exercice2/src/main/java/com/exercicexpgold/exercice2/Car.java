/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexpgold.exercice2;

/**
 *
 * @author Konate-MK
 */
public class Car {
    
    //les proprietes de notre class Car
    
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    
    // Constructeur par défaut
    
    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.price = 0.0;
    }
    
    // Constructeur paramétré
    
    public Car(String make, String model, int year) {
        this();
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Autre constructeur paramétré avec toutes les informations
    
    public Car(String make, String model, int year, String color, double price) {
        this(make, model, year);
        this.color = color;
        this.price = price;
    }
    
    
    // Méthode displayCarInfo
    
    public void displayCarInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color + ", Price: " + price);
    }
    
}

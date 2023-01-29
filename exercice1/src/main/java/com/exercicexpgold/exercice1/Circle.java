/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexpgold.exercice1;

/**
 *
 * @author Konate-mk
 */
public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        this(1);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
    
}


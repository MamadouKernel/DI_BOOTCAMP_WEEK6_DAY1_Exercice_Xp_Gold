/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice1;

/**
 *
 * @author kernel-mk
 */
public class Exercice1 {

    public static void main(String[] args) {
        
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(0);
        Circle circle3 = new Circle(12);
        Circle circle4 = new Circle(24);

        System.out.println("Circle 1 Radius: " + circle1.getRadius() + " Area: " + circle1.getArea());
        System.out.println("Circle 2 Radius: " + circle2.getRadius() + " Area: " + circle2.getArea());
        System.out.println("Circle 3 Radius: " + circle3.getRadius() + " Area: " + circle3.getArea());
        System.out.println("Circle 4 Radius: " + circle4.getRadius() + " Area: " + circle4.getArea());
        
    }
}

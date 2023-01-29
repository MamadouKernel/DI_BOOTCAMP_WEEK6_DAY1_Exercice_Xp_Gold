/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice2;

/**
 *
 * @author Konate-MK
 */
public class Exercice2 {

    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.displayCarInfo();

        Car car2 = new Car("Toyota", "Camry", 2021);
        car2.displayCarInfo();

        Car car3 = new Car("Honda", "Civic", 2022, "Red", 25000.0);
        car3.displayCarInfo();
        
    }
}

/**
 *
 * @author Konate-MK
 */
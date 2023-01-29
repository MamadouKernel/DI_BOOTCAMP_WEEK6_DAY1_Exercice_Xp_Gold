/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice3;

/**
 *
 * @author Konate-MK
 */

public class Exercice3 {

    public static void main(String[] args) {
        
    Student student1 = new Student();
    student1.displayStudentInfo();

    Student student2 = new Student("Kernel Mamadou K", 25);
    student2.displayStudentInfo();

    Student student3 = new Student("Konate Mamadou", 27, "Computer Science", 'A');
    student3.displayStudentInfo();
    
    }
}

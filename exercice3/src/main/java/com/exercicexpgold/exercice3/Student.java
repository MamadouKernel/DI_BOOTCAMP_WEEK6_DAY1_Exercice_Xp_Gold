/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexpgold.exercice3;

/**
 *
 * @author Konate-MK
 */

public class Student {
    
  private String name;
  private int age;
  private String course;
  private char grade;
  
  //constructeur non paramétré
  
  public Student() {
    this.name = "";
    this.age = 0;
    this.course = "";
    this.grade = ' ';
  }
  
  //constructeur paramétré
  
  public Student(String name, int age) {
    this();
    this.name = name;
    this.age = age;
  }
  
  //constructeur paramétré avec le reste des proprietes
  
  public Student(String name, int age, String course, char grade) {
    this(name, age);
    this.course = course;
    this.grade = grade;
  }
  
  //methode displayStudentInfo()
  
  public void displayStudentInfo() {
    System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course + ", Grade: " + grade);
  }
  
}

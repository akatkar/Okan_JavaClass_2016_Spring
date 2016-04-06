/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson07;

/**
 *
 * @author akatkar
 */
public class Circle extends Shape {
    public static final double PI = 3.14;
    
    double radius;
    
    Circle(double radius){
        super();
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2*PI*radius);
     }

    @Override
    public double area() {
        return (PI*radius*radius);
    }
    
}

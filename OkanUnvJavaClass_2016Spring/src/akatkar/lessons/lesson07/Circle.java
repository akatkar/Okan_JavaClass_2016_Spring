/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
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

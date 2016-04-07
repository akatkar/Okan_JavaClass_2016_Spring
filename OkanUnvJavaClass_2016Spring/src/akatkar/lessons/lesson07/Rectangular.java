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
public class Rectangular extends Shape{

    private int height, width;
    
    public Rectangular(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    @Override
    public double area() {
        return height * width;
    }
    
}

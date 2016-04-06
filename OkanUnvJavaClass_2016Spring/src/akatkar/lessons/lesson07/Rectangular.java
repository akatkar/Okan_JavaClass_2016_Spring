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

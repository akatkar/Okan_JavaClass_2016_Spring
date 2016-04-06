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
public class Square extends Rectangular{

    public Square(int height) {
        super(height, height);
    }
    
    public double area(){
        System.out.println("KARE nin metodu");
        return super.area();
    }
    
}

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
public class MainClass {

    private static void hesapla(Shape sh) {
        if (sh instanceof Circle) {
            Circle rect = (Circle)sh;
            System.out.println("Çevre:" + sh.perimeter() + " alan:" + sh.area());
        }
        
        
    }

    public static void main(String[] args) {
        // Shape shape = new Shape("Shape"); // abstract(soyut) sınıf
        Rectangular rect = new Rectangular(3, 2);
        Square square = new Square(5);
        Circle circle = new Circle(4);

        hesapla(rect);
        hesapla(square);
        hesapla(circle);
//        shape = rect;
//        shape = square;
//        shape = circle;

        //rect = shape; HATA
        rect = square;
        //rect = circle; HATA

        //square = shape; HATA
        //square = rect; HATA
        //square = circle; // HATA
    }

}

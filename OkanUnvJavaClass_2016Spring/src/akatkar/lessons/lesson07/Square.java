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
public class Square extends Rectangular{

    public Square(int height) {
        super(height, height);
    }
    
    public double area(){
        System.out.println("KARE nin metodu");
        return super.area();
    }
    
}

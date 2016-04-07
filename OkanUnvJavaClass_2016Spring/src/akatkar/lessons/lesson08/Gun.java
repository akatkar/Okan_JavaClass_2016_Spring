/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson08;

/**
 *
 * @author akatkar
 */
public class Gun implements Moveable{

    @Override
    public void move(int speed) {
        System.out.println("Gun hareket etti");
    }
    
}

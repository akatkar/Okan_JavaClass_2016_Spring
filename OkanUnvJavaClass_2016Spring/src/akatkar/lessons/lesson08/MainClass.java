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
public class MainClass {
    
    public static void moveAllItems(Moveable[] items){        
        for(Moveable m:items){
            m.move(2);
        }        
    }
    
    public static void main(String[] args) {
       
        SpaceShip ship = new SpaceShip();
        Missile mis =new Missile();
        Gun gun = new Gun();
               
        Moveable[] items = new Moveable[3];
        items[0] = ship;
        items[1] = mis;
        items[2] = gun;
       
        moveAllItems(items);
        
    }
}

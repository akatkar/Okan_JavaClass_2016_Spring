/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akatkar.lessons.lesson08;

/**
 *
 * @author User
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

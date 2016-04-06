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
public class Gun implements Moveable{

    @Override
    public void move(int speed) {
        System.out.println("Gun hareket etti");
    }
    
}

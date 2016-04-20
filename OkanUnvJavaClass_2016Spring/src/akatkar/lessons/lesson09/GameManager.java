/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson09;

import akatkar.lessons.lesson09.shapes.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akatkar
 */
public class GameManager implements Drawable {

    private List<Drawable> drawList = new ArrayList<>();

    public GameManager(){
        drawList.add(new Drawable(){

            @Override
            public void draw(Graphics g) {
               
            }
            
        });
    }
    
    public void addDrawable(Drawable d) {
        drawList.add(d);
    }

    public void drawAll() {
        for (Drawable d : drawList) {
            d.draw(null);
        }
    }

    public static void main(String[] args) {

        GameManager manager = new GameManager();

        manager.addDrawable(new Circle(2.0));
        manager.addDrawable(new Rectangular(1, 2));
     //   manager.addDrawable(new Triangle(1, 2, 3));

//        Drawable dx = new Drawable(){
//
//            @Override
//            public void draw(Graphics g) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        };
        manager.addDrawable(new Drawable() {

            @Override
            public void draw(Graphics g) {
                g.drawString("Manager", 3, 5);
            }
        });
        
        manager.addDrawable(manager);
    }

    @Override
    public void draw(Graphics g) {
        g.drawString("Manager", 3, 5);
    }
}

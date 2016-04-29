/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.sprite;

import java.awt.Color;

/**
 *
 * @author akatkar
 */
public class DragRect extends Rectangle {

    protected boolean draggable;
    protected int oldX,oldY;

    public DragRect(int x, int y, int width, int height, Color c) {
        super(x, y, width, height, c);
        draggable = false;
    }
    
    public boolean isDraggable() {
        return draggable;
    }

    public void setDraggable(boolean draggable) {
        this.draggable = draggable;
    }

    public boolean isInside(int x, int y) {
        boolean result = (x >= this.x && y >= this.y && 
               (x <= this.x + width) && 
               (y <= this.y + height));
        
        if(result){
            oldX = x;
            oldY = y;    
        }
        return result;
    }

    public void drag(int x, int y) {
        this.x += x - oldX;
        this.y += y - oldY;
        oldX = x;
        oldY = y;
    }
}

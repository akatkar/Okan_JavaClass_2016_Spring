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
abstract public class Sprite2D extends Sprite {
    protected int x;
    protected int y;
    protected Color color;
    protected boolean fill;

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color=color;
    }
    public boolean getFill(){
        return fill;
    }
    public void setFill(boolean fill){
        this.fill=fill;
    }
}


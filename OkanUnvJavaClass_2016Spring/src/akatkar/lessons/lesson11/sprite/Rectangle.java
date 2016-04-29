/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.sprite;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author akatkar
 */
public class Rectangle extends Sprite2D {

    protected int width;
    protected int height;

    public Rectangle(int x, int y, int width, int height, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = c;
        fill = true;
        restore();
    }

    @Override
    public void paint(Graphics g) {
        if (visible) {
            g.setColor(color);
            if (fill) {
                g.fillRect(x, y, width, height);
            } else {
                g.drawRect(x, y, width, height);
            }
        }
    }

    @Override
    public void update() {        
    }
}

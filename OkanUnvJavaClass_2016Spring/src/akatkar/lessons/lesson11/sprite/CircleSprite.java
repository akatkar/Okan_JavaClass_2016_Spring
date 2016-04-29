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
public class CircleSprite extends Sprite2D {

    protected int radius;

    public CircleSprite(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.radius = r;
        this.color = c;
        this.fill = true;
        restore();
    }

    @Override
    public void paint(Graphics g) {
        if (visible) {
            g.setColor(color);
            if (fill) {
                g.fillOval(x, y, radius, radius);
            } else {
                g.drawOval(x, y, radius, radius);
            }
        }
    }

    @Override
    public void update() {
    }
}

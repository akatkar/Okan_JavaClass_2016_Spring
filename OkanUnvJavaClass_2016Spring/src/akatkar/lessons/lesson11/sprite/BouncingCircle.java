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
public class BouncingCircle extends CircleSprite implements Moveable {

    protected int maxWidth;
    protected int maxHeight;
    protected int vx;
    protected int vy;

    public BouncingCircle(int x, int y, int r, Color c, int maxX, int maxY) {
        super(x, y, r, c);
        maxWidth = maxX;
        maxHeight = maxY;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setVelocity(int x, int y) {
        vx = x;
        vy = y;
    }

    @Override
    public void updatePosition() {
        this.x += vx;
        this.y += vy;
    }

    @Override
    public void update() {
        if ((x + radius >= maxWidth) || (x < 0)) {
            vx = -vx;
        }
        if ((y + radius >= maxHeight) || (y < 0)) {
            vy = -vy;
        }
        updatePosition();
    }
}

/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.sprite;

import java.awt.Graphics;

/**
 *
 * @author akatkar
 */
abstract public class Sprite {

    protected boolean visible;
    protected boolean active;

    abstract public void paint(Graphics g);

    abstract public void update();

    public boolean isVisible() {
        return visible;
    }

    public boolean isActive() {
        return active;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void suspend() {
        setVisible(false);
        setActive(false);
    }

    public void restore() {
        setVisible(true);
        setActive(true);
    }
}

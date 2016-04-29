/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.sprite;

/**
 *
 * @author akatkar
 */
public interface Moveable {

    public void setPosition(int x, int y);

    public void setVelocity(int x, int y);

    public void updatePosition();
}

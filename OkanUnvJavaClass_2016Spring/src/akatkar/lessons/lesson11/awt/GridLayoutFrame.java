/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.awt;

import java.awt.*;
/**
 *
 * @author akatkar
 */
public class GridLayoutFrame extends Frame {

    public GridLayoutFrame(String caption) {
        super(caption);
        Panel pa = new Panel();
        Button but1 = new Button("bir");
        Button but2 = new Button("iki");
        Button but3 = new Button("üç");
        Button but4 = new Button("dört");
        Button but5 = new Button("beş");

        pa.setLayout(new GridLayout(2, 3));
        pa.add(but1);
        pa.add(but2);
        pa.add(but3);
        pa.add(but4);
        pa.add(but5);

        this.add(pa);
        setSize(500, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        GridLayoutFrame frame = new GridLayoutFrame("Grid Örneği");
    }
}


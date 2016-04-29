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
public class BorderLayoutExample {

    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout");
        Button ba1 = new Button("kuzey");
        Button ba2 = new Button("guney");
        Button ba3 = new Button("dogu");
        Button ba4 = new Button("batı");
        Button ba5 = new Button("merkez");

        Panel pa = new Panel();
        pa.setLayout(new BorderLayout());
        pa.add(ba1, BorderLayout.NORTH);
        pa.add(ba2, BorderLayout.SOUTH);
        pa.add(ba3, BorderLayout.EAST);
        pa.add(ba4, BorderLayout.WEST);
        pa.add(ba5, BorderLayout.CENTER);
        frame.add(pa);

        frame.setSize(300, 300);// (x,y)
        frame.setVisible(true);

    }
}

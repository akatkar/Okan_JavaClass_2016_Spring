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
public class FlowLayoutFrame extends Frame {

    public FlowLayoutFrame(String caption) {
        super(caption);
        Panel pa = new Panel();
        add(pa);
        pa.setLayout(new FlowLayout());
        pa.add(new Button("Hey"));
        pa.add(new Button("how"));
        pa.add(new Button("are"));
        pa.add(new Button("you"));
        pa.add(new Button("?"));
        setSize(200, 150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        FlowLayoutFrame frame = new FlowLayoutFrame("FlowLayout Örneği");
    }
}

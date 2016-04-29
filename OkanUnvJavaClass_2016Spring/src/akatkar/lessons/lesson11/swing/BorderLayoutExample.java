/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.*;

/**
 *
 * @author akatkar
 */
public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample(String caption) {
        super(caption);

        Container myPane = getContentPane();
        myPane.setLayout(new BorderLayout());
        JButton mybut1 = new JButton("North");
        JButton mybut2 = new JButton("South");
        JButton mybut3 = new JButton("East");
        JButton mybut4 = new JButton("West");
        JButton mybut5 = new JButton("Center");
        myPane.add(mybut1, BorderLayout.NORTH);
        myPane.add(mybut2, BorderLayout.SOUTH);
        myPane.add(mybut3, BorderLayout.EAST);
        myPane.add(mybut4, BorderLayout.WEST);
        myPane.add(mybut5, BorderLayout.CENTER);
        
        
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BorderLayoutExample bl = new BorderLayoutExample("Swing BorderLayout");
            }
        });
    }
}

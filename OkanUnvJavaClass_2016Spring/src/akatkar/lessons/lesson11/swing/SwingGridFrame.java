/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.swing;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author akatkar
 */
public class SwingGridFrame extends JFrame {

    public SwingGridFrame(String caption) {
        super(caption);
        Container myPane = getContentPane();
        myPane.setLayout(new GridLayout(2, 3));
        JButton mybut1 = new JButton("first");
        JButton mybut2 = new JButton("second");
        JButton mybut3 = new JButton("third");
        JButton mybut4 = new JButton("forth");
        JButton mybut5 = new JButton("fifth");
        myPane.add(mybut1);
        myPane.add(mybut2);
        myPane.add(mybut3);
        myPane.add(mybut4);
        myPane.add(mybut5);
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingGridFrame gf = new SwingGridFrame("Swing GridLayout");
            }
        });
    }
}

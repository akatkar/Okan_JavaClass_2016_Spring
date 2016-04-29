/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.drag;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author akatkar
 */
public class MainWindow extends JFrame {

    private final DrawingJPanel surface = new DrawingJPanel();

    public MainWindow() {

        add(surface);

        setTitle("Sürüklenebilen Dikdörtgen");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow();
            }
        });
    }

}

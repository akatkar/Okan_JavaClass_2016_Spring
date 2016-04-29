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
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author akatkar
 */
public class SwingSampleForm extends JFrame {

    public SwingSampleForm(String caption) {
        super(caption);
        Container myPane = this.getContentPane();
        myPane.setLayout(new FlowLayout());

        JLabel jl = new JLabel("Web address: ", JLabel.RIGHT);
        JTextField jtf = new JTextField(20);
        JLabel jl1 = new JLabel(
                "Which option do you prefer?\n", JLabel.CENTER);
        JTextArea comments
                = new JTextArea("The first option\n"
                        + "The second option\n"
                        + "The third option", 3, 20);
        JCheckBox example1 = new JCheckBox("Yes");
        JCheckBox example2 = new JCheckBox("No", true);
        JRadioButton rb1 = new JRadioButton("one  ", false), rb2 = new JRadioButton(
                "two", false), rb3 = new JRadioButton("three", true);
        myPane.add(jl);
        myPane.add(jtf);
        myPane.add(jl1);
        myPane.add(comments);
        myPane.add(example1);
        myPane.add(example2);
        myPane.add(rb1);
        myPane.add(rb2);
        myPane.add(rb3);

        this.setSize(350, 200);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingSampleForm sf = new SwingSampleForm("Swing Sample Form");
            }
        });
    }
}

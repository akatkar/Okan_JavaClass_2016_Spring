/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.swing;

/**
 *
 * @author akatkar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingFlowFrame extends JFrame implements ActionListener{

    public SwingFlowFrame(String caption) {
        super(caption);

        Container myPane = this.getContentPane();
        myPane.setLayout(new FlowLayout());
        JButton heyButton = new JButton("Hey");
        myPane.add(heyButton);
        JButton closeButton = new JButton("how");
        myPane.add(closeButton);
        myPane.add(new JButton("are"));
        myPane.add(new JButton("you"));
        myPane.add(new JButton("?"));

        heyButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SwingFlowFrame newFrame = new SwingFlowFrame("Bu yeni olan");
            }
        });
        
        closeButton.addActionListener(this);
        
        this.setSize(200, 150);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void onCloseButtonClick(ActionEvent e){
        this.dispose();
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingFlowFrame ff = new SwingFlowFrame("Swing FlowLayout");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
}

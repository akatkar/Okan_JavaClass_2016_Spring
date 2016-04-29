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
public class ComponentExample {

    public static void main(String[] args) {
        Frame myFrame = new Frame("Bileşenler");
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());

        Button mybutton = new Button("myButton");
        panel.add(mybutton);

        Label label = new Label("Labels with awt", Label.LEFT);
        panel.add(label);

        TextField tf = new TextField("TEXT", 4);
        panel.add(tf);

        TextArea comments = new TextArea(
                "This is on line 1\n"
                + "This is on line 2", 3, 20);
        panel.add(comments);

        Checkbox cb1 = new Checkbox("It is OK?");
        panel.add(cb1);
        Checkbox cb2 = new Checkbox("It is not OK?", true);
        panel.add(cb2);

        CheckboxGroup age = new CheckboxGroup();
        panel.add(new Checkbox("Under 10 years old", false, age));
        panel.add(new Checkbox("10 to 14 years old", false, age));
        panel.add(new Checkbox("15 to 19 years old", true, age));
        panel.add(new Checkbox("Over 20 years old", false, age));

        Choice choice = new Choice();
        choice.add("Left");
        choice.add("Center");
        choice.add("Right");
        choice.add("Random");
        panel.add(choice);

        myFrame.add(panel);

        myFrame.setSize(300, 300);
        myFrame.setVisible(true);

    }

}

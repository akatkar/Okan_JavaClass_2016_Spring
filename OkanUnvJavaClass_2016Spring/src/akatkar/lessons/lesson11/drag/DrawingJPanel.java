/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson11.drag;

import akatkar.lessons.lesson11.sprite.DragRect;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 *
 * @author akatkar
 */
public class DrawingJPanel extends JPanel implements MouseListener, MouseMotionListener {

    private DragRect r = new DragRect(10, 20, 30, 30, Color.BLUE);

    public DrawingJPanel() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    private void doDrawing(Graphics g) {
        r.paint(g);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public boolean mouseDown(Event e, int x, int y) {
        if (r.isInside(x, y)) {
            r.setDraggable(true);
        }
        return true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (r.isInside(x, y)) {
            System.out.println("Oley");
            r.setDraggable(true);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        r.setDraggable(false);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (r.isDraggable()) {
            r.drag(x, y);
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}

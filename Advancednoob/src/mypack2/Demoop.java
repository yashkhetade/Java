package mypack2;

import java.awt.*;
import java.awt.event.*;

public class Demoop  extends Frame implements MouseMotionListener {
	
	
    private int totalMovementX = 0;
    private int totalMovementY = 0;

    public Demoop() {
        addMouseMotionListener(this);
        setSize(400, 400);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        // do nothing
    }

    public void mouseDragged(MouseEvent e) {
        int movementX = e.getX() - getX();
        int movementY = e.getY() - getY();
        totalMovementX += movementX;
        totalMovementY += movementY;
        System.out.println("Total movement: (" + totalMovementX + ", " + totalMovementY + ")");
    }
	
	
	
	public static void main(String[] args) {
	  new Demoop();
	}
	
	
	
}
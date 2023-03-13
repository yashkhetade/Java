package mypack2;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


class demo12 extends JFrame implements KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l;
	
	demo12(){
		l=new JLabel("default");
		add(l);
		addKeyListener(this);
		
		setLayout(new FlowLayout());
		
		
		
	}

	public void keyTyped(KeyEvent e) {
		
		l.setText("keyptyped");
	}

	public void keyPressed(KeyEvent e) {
		
		l.setText("keypressed");
	}

	public void keyReleased(KeyEvent e) {
		l.setText("keypreleased");
		
	}
	
	
	
}



public class Day12 {

	
	public static void main(String[] args) {
		
		demo12 obj =new demo12();
		obj.setSize(500,500);
		obj.setVisible(true);
		
	}
	
}

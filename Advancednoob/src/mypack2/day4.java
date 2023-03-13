package mypack2;

import java.awt.*;

import java.awt.event.*;


class demo4 extends Frame implements KeyListener{
	
	
	Label l1;

	
	
	demo4(){
		
		
		
		super("keyboard events");
		
		
		l1=new Label("default label 1");
		
		addKeyListener(this);
		
	
		
	
		
	
		
	
		
		setLayout(new FlowLayout());
		add(l1);
		
		
		
		
		
		
		
		addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				dispose();
				
			}
			
			
		});
		

		
	}


	public void keyTyped(KeyEvent e) {
		l1.setText("KeyTyped");
		
	}



	public void keyPressed(KeyEvent e) {
		l1.setText("KeyPressed");
		
	}



	public void keyReleased(KeyEvent e) {
		l1.setText("KeyReleased");
		
	}

	
}


public class day4 {

	
	public static void main(String[] args) {
		
		demo4 obj =new demo4();
		obj.setSize(300,300);
		obj.setVisible(true);
	}
}



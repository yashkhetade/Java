package mypack2;

import java.awt.*;
import java.awt.event.*;
class demo7 extends Frame implements Runnable {
	
	int x,y,tx,ty;
	
	Label l;
	public demo7() {
		
		x=y=100;
		tx=ty=1;
		setLayout(new FlowLayout());
		
		
		addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e) {
				dispose();
				
			}
			
		});
		
	}
	
	public void paint(Graphics g) {
		
		g.fillOval(x, y, 100, 100);
	}

	public void run() {
		
		while(true) {
		x=x+tx;
		y=y+ty;
		
		if(x<0||x>500) 
			tx=tx*-1;
			
		if(y<0||x>450) 
			ty=ty*-1;
		repaint();
		}
			
	}
	
	
	
	
}

public class Day7 {

	public static void main(String[] args) {
		
		demo7 obj=new demo7();
		obj.setSize(300,300);
		obj.setVisible(true);
		
		Thread t1=new Thread(obj);
		t1.run();
		
		
	}
	
	
	
	
}

package mypack2;

import java.awt.*;

import java.awt.event.*;

class demo extends Frame implements MouseListener{
	
	Label l1;
	demo(){
		
		super("Mouse Events");
		l1=new Label(" default");
		
		
		add(l1);
	
		
		l1.addMouseListener(this);
		
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent e) {
				
				dispose();
				
			}
			
			
		});
		
	}

	public void mouseClicked(MouseEvent e) {
		
		l1.setText("Mouse Clicked");
		
		
	}

	public void mousePressed(MouseEvent e) {
		l1.setText("Mouse Pressed");
		
	}

	public void mouseReleased(MouseEvent e) {
		l1.setText("Mouse Released");
		
	}

	public void mouseEntered(MouseEvent e) {
	
		l1.setText("Mouse Entered");
	}

	public void mouseExited(MouseEvent e) {
		l1.setText("Mouse Exited");
		
	}
	
	
	
	
}

public class MouseEventsemp {

	public static void main(String[] args) {
		
		demo obj =new demo();
		obj.setSize(500,500);
		obj.setVisible(true);
		
			
			
		
		
	}
}

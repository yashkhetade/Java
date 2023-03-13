package mypack2;
import java.awt.*;

import java.awt.event.*;

class Demo8 extends Frame implements KeyListener{
	
	Label l;
	Demo8(){
		
		super("keyevents");
    l=new Label ("default");
    
    add(l);
    addKeyListener(this);
    
    setLayout(new FlowLayout());
		
		
    addWindowListener(new WindowAdapter() {
    	
    	public void windowClosing(WindowEvent e) {
    		 dispose();
    		
    	}
    });
    
	}
	public void keyTyped(KeyEvent e) {
		l.setText("keytyped");
		
	}
	public void keyPressed(KeyEvent e) {
		
		l.setText("keypressed");
	}
	public void keyReleased(KeyEvent e) {
		l.setText("keyreleased");
		
	}
	
	


	
}

public class Day8 {

	public static void main(String[] args) {
		
		Demo8 obj =new Demo8();
		obj.setSize(500,500);
		obj.setVisible(true);
	}
}

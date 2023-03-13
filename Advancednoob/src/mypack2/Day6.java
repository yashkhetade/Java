package mypack2;
import java.awt.*;

import java.awt.event.*;

class Demo6 extends Frame implements WindowListener{
	
	Label l;
	
	Demo6(){
		
		l=new Label("default");
		setLayout(new FlowLayout());
		add(l);
		
		addWindowListener(this);
		
		
		
//		addWindowListener(new WindowAdapter() {
//			
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//			
//		});
		
	}

	public void windowOpened(WindowEvent e) {
		 l.setText("window opened ");
		
	}

	public void windowClosing(WindowEvent e) {
		l.setText("window closing ");
		
	}

	public void windowClosed(WindowEvent e) {
		l.setText("window  closed");
		
	}

	public void windowIconified(WindowEvent e) {
		l.setText("window iconified ");
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		l.setText("window activated ");
		
	}

	public void windowDeactivated(WindowEvent e) {
		l.setText("window deactivated ");
		
	}
	
	
	
}


public class Day6 {

	
	public static void main(String[] args) {
		 Demo6 obj =new Demo6();
		 obj.setSize(300,300);
		 obj.setVisible(true);
		 
		 
		
	}
}

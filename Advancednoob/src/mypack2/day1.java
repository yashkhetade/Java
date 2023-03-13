package mypack2;
import java.awt.*;

import java.awt.event.*;

public class day1 extends Frame {
	
	public day1() {
		 Label l=new Label("new label");
		 setLayout(new FlowLayout());
		 Button b=new Button("click here");
		 TextField tf=new TextField(20);
		 
		 add(l);
		 add(b);  
		 add(tf);
		 
		 
		  addWindowListener (new WindowAdapter() {    
	            public void windowClosing (WindowEvent e) {    
	                dispose();    
	            }   
		  });
		 
		 
	}

	public static void main(String[] args) {
		 
		 day1 obj=new day1();
		 obj.setVisible(true);
		 obj.setSize(300,300);
	}
	
}

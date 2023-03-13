package mypack2;

import java.awt.*;



import javax.swing.*;

class Demo10 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 975770862771695598L;
	JTextField tf;
	JFormattedTextField ft;
	Demo10(){
    
	tf=new JTextField("enter here");
	ft= new JFormattedTextField(" enter your info here");
	ft.setColumns(15);
	
	setLayout(new FlowLayout());
	
	add(tf);
	add(ft);
		
	}
	
}

public class day10 {

	public static void main(String[] args) {
		Demo10 obj =new Demo10();
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

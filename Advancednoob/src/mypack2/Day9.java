package mypack2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class demo9 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5441616119192366871L;
	JLabel l;
	JButton b;
	int count=0;
	demo9(){
		
		super("button events");
		l=new JLabel("clicked "+count+"times");
		b=new JButton("Click Me");
		b.addActionListener(this);
		add(l);
		add(b);
		
		setLayout(new FlowLayout());
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText("clicked "+count+"times");
		
	}

	
	
}

public class Day9 {
	public static void main(String[] args) {
		
		demo9 obj=new demo9();
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}

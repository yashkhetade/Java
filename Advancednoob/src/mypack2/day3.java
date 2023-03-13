package mypack2;

import java.awt.*;

import java.awt.event.*;


class Demo2 extends Frame implements ActionListener {
	
	int count=0;
	Label l;
	Button b;
	Demo2(){
		
		super("buttondemo");
	 l=new Label(""+count);
		
	 b=new Button("click me");
	 b.addActionListener(this);
	 
	 setLayout(new FlowLayout());
	 add(l);
	 add(b);
		
	
	
	addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent e) {
			dispose();
			
		}
		
		
	});
   
}
	

	
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText(""+count);
		
	}


	
	
	
	
}


public class day3 {

	public static void main(String[] args) {
		
		Demo2 obj =new Demo2();
		
		obj.setSize(300,300);
		obj.setVisible(true);
	}
	
}

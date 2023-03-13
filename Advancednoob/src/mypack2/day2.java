package mypack2;
import java.awt.*;
import java.awt.event.*;


 class Buttondemo extends Frame implements ActionListener{
	 
	  int count=0;
	  Label l;
	  Button b;
	  
	  public Buttondemo(){
		   
			
			 l=new Label("default");
			
			 b=new Button("click me");
			 b.addActionListener(this);
			
//			TextField f=new TextField(20);
			
			
			setLayout(new FlowLayout());
			add(l);
			add(b);
//			add(f);
		
			
			
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e) {
					dispose();
					
				}
				
			});
		   
	   }
	

		public void actionPerformed(ActionEvent e) {
			
			l.setText("welcome bro");
			
		}
	   
	
	
	
}

public class day2 {
	
	public static void main(String[] args) {
		
		Buttondemo obj=new Buttondemo();
		
		obj.setVisible(true);
		obj.setSize(300,300);
	}


	
	
	
}
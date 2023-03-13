package mypack2;
//Name-Yash Khetade
//Roll no-304B023

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Experiment3 extends JFrame {
	JPanel jp = new JPanel();
	JLabel lname = new JLabel();
	JButton bsubmit = new JButton("Submit");
	JTextField tname = new JTextField(20);
	JLabel lmath = new JLabel();
	JTextField tmath = new JTextField(20);
	JLabel lSci = new JLabel();
	JTextField tSci = new JTextField(20);
	JLabel lEnglish = new JLabel();
	JTextField tEnglish = new JTextField(20);
	
	public Experiment3(){
		lname.setText("Enter Name");
		jp.add(lname);
		jp.add(tname);
		lmath.setText("Enter Maths Marks");
		jp.add(lmath);
		jp.add(tmath);
		lmath.setText("Enter Science Marks");
		jp.add(lSci);
		jp.add(tSci);
		lmath.setText("Enter English Marks");
		jp.add(lEnglish);
		jp.add(tEnglish);
		jp.add(bsubmit);
		add(jp);
		
		bsubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				String val = tname.getText();
				JLabel l1 = new JLabel("Welcome" + val);
				int sub1 = Integer.parseInt(tmath.getText());
				int sub2 = Integer.parseInt(tSci.getText());
				int sub3 = Integer.parseInt(tEnglish.getText());
				int sum = sub1+sub2+sub3;
				float avg = sum/3;
				
				JLabel l2 = new JLabel("Average : " + avg);
				JPanel jip = new JPanel();
				jip.add(l1);
				jip.add(l2);
				JFrame inf = new JFrame();
				inf.setVisible(true);
				inf.add(jip);
				inf.setSize(300, 100);
			}
		});
				
	}
	
	public static void main(String [] args){
		Experiment3 rc = new Experiment3();
		rc.setSize(300, 300);
		rc.setVisible(true);
		
	}
	

}

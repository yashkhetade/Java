package mypack2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;



import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class exp1 extends Applet implements KeyListener {
String str = "Key Board Events";
	
	public void init(){
		addKeyListener(this);
	}
	
	
	public void keyPressed(KeyEvent e){
		str = "Key Pressed";
		showStatus("Key is Pressed");
		repaint();
	}
	

	public void keyReleased(KeyEvent e){
		str = "Key Released";
		showStatus("Key is Released");
		repaint();
	}
	
	
	public void keyTyped(KeyEvent e){
		char key = e.getKeyChar();
		str = "Key Typed: ";
		str += key;
		showStatus("Key is Typed");
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString(str, 50, 50);
	}
}
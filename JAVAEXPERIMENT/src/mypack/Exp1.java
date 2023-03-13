package mypack;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;
public class Exp1_KeyBoardEvents extends Applet implements KeyListener{
String str = "Key Board Events";
public void init() {
addKeyListener(this);
}
@Override
public void keyPressed(KeyEvent e) {
str = "Key Pressed";
repaint();
}
@Override
public void keyReleased(KeyEvent e) {
str = "Key Released";
repaint();
}
@Override
public void keyTyped(KeyEvent e) {
char key = e.getKeyChar();
str = "Key Typed : " ;
str+= key;
repaint();
}
public void paint(Graphics g) {
g.drawString(str, 50, 50);
}
}

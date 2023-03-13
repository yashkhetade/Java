package mypack;

import java.util.*;



class Complex {
	
	int  r,i;
	
	
	Complex(){
		
		
	}

  Complex(int r,int i){
		
		this.r=r;
		this.i=i;
		
	}

	
	
	public void show() {
		
		System.out.println(r+ "+" + "i" +i);
	}
	
	Complex add(Complex c1,Complex c2) {
		
		Complex t=new Complex();
	    
		t.r=c1.r+c2.r;
		t.i=c1.i+c2.i;
		
		return t;
		
		
		
	}
	
}



public class Demoxyz {

	public static void main(String[] args) {
		
		
		Complex c1=new Complex(2,3);
		c1.show();
		
		Complex c2=new Complex(4,5);
		c2.show();
		
		Complex c3=new Complex();
		
		c3=c3.add(c1,c2);
		
		System.out.println("after addition");
		c3.show();
		
		
		
		
	}
	
	
	
}
